package com.xlsx.excelparse;

import com.xlsx.excelparse.readexcelfile.ReadExcelFile;
import com.xlsx.excelparse.utils.ExcelParseUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class App {

    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        if (args.length == 1) {
            File file = new File(args[0]);
            if (ExcelParseUtils.isFileValid(file)) {
                logger.info("File is valid processing file now.");
                ReadExcelFile readExcelFile = new ReadExcelFile(file);
                readExcelFile.printRepOrderList(readExcelFile.readRepOrdersAddToList());
            } else {
                logger.error("The file entered is not a valid file. Please try again.");
                System.exit(0);
            }
        } else {
            logger.error("There was either no argument entered. Please try again.");
            System.exit(0);
        }
    }
}
