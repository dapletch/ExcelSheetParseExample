package com.xlsx.excelparse.utils;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * Created by Seth on 4/6/2017.
 */
public class ExcelParseUtils {

    private static Logger logger = LoggerFactory.getLogger(ExcelParseUtils.class);

    public static Boolean isFileValid(File file) {
        logger.info("File Entered: " + file);
        return file.isFile()
                && file.exists()
                && !file.isDirectory();
    }

    public static DateTime stringDateToDateTime(String dateStr) {
        logger.info("DateStr: " + dateStr);
        if (dateStr != null) {
            return DateTime.parse(dateStr, DateTimeFormat.forPattern("dd-MMM-yyyy")).toDateTime();
        }
        return null;
    }

    public static Integer stringToInteger(String intStr) {
        logger.info("IntStr: " + intStr);
        if (!intStr.equals("")) {
            return Integer.parseInt(intStr.substring(0, intStr.indexOf(".")));
        }
        return null;
    }

    public static Double stringToDouble(String doubleStr) {
        logger.info("DoubleStr: " + doubleStr);
        if (!doubleStr.equals("")) {
            return Double.parseDouble(doubleStr);
        }
        return null;
    }
}
