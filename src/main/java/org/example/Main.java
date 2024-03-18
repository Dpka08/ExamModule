package org.example;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        // read content from excel file -- binary object-- java object.
        try{
    File file = new File("/Users/dipeshgurung/eclipse-workspace/ExamModule/src/main/resources/employee.xlsx");
    FileInputStream fileInputStream = new FileInputStream(file);

    // convert binary to xssf work book object.
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);



            // read from the column.
            Iterable<column> columnIterable= row.columnIterable();
            while(columnIterable.hasnext()){
                column column = columnIterable.next();
                System.out.println("column"+(column.getColumnIndex()+1));
                System.out.println("Value:");
                switch (column.getColumnType()){
                    case STRING:
                        System.out.println(column.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.println(column.getNumericColumnValue());
                        break;
                    case BOOLEAN:
                        System.out.println(column.getBooleanValue());
                        break;


                }

            }
        }






}