package com.xlsx.excelparse.readexcelfile;

import com.xlsx.excelparse.beans.RepOrders;
import com.xlsx.excelparse.utils.ExcelParseUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Seth on 4/6/2017.
 */
public class ReadExcelFile {

    private File excelFile;
    private Logger logger = LoggerFactory.getLogger(ReadExcelFile.class);
    private List<RepOrders> repOrdersList = new ArrayList<RepOrders>();

    public List<RepOrders> readRepOrdersAddToList() {
        try {
            FileInputStream file = new FileInputStream(excelFile);
            Workbook workbook = new XSSFWorkbook(file);
            // get the data sheet in the file based on the index position first one being at index 0, and continuing from there
            Sheet dataSheet = workbook.getSheetAt(0);

            for (Row currentRow : dataSheet) {
                // Skipping over the row that contains the headers
                if (currentRow.getRowNum() > 0) {
                    RepOrders repOrders = new RepOrders();
                    repOrders.setOrderDate(ExcelParseUtils.stringDateToDateTime(String.valueOf(currentRow.getCell(0))));
                    repOrders.setRegion(currentRow.getCell(1).getStringCellValue());
                    repOrders.setRepresentative(currentRow.getCell(2).getStringCellValue());
                    repOrders.setItem(currentRow.getCell(3).getStringCellValue());
                    repOrders.setUnits(ExcelParseUtils.stringToInteger(String.valueOf(currentRow.getCell(4))));
                    repOrders.setUnitCost(ExcelParseUtils.stringToDouble(String.valueOf(currentRow.getCell(5))));
                    repOrders.setTotal(ExcelParseUtils.stringToDouble(String.valueOf(currentRow.getCell(6))));
                    repOrdersList.add(repOrders);
                }
            }
        } catch (Exception e) {
            logger.error("There was an exception: " + e);
        }
        return repOrdersList;
    }

    public void printRepOrderList(List<RepOrders> repOrdersList) {
        Integer count = 0;
        for(RepOrders repOrders : repOrdersList) {
            logger.info("RepOrder " + count + " " + repOrders.toString());
            count++;
        }
    }

    public ReadExcelFile(File excelFile) {
        this.excelFile = excelFile;
    }

    public File getExcelFile() {
        return excelFile;
    }

    public void setExcelFile(File excelFile) {
        this.excelFile = excelFile;
    }
}
