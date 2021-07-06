/*
 * Copyright (c) 2021 GetWrath.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.dstadler.poiandroidtest.poitest.test;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class TestIssue28 {
  public static void saveExcelFile(FileOutputStream outputStream) throws IOException {

    Workbook wb = new HSSFWorkbook();

    CellStyle cs = wb.createCellStyle();
    cs.setFillForegroundColor(HSSFColor.HSSFColorPredefined.LIME.getIndex());

    Sheet sheet1 = wb.createSheet("wrok");

    Row row = sheet1.createRow(0);
    Cell c = row.createCell(0);
    c.setCellValue("Name");
    c.setCellStyle(cs);
    c = row.createCell(1);
    c = row.createCell(2);
    c.setCellValue("M");
    c.setCellStyle(cs);
    c = row.createCell(3);
    c.setCellValue("A");
    c.setCellStyle(cs);
    c = row.createCell(4);
    c.setCellValue("E");
    c.setCellStyle(cs);
    int rowOne = 1;

    final Row row1 = sheet1.createRow(rowOne);
    Cell cell1 = row1.createCell(0);
    cell1.setCellValue("Name");
    cell1 = row1.createCell(1);
    cell1.setCellValue("Morning");
    cell1 = row1.createCell(2);
    cell1.setCellValue("Afternoon");
    cell1 = row1.createCell(3);
    cell1.setCellValue("Evening");

    sheet1.setColumnWidth(2, (15 * 500));

    wb.write(outputStream);
  }
}
