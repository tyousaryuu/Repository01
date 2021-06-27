package tt.ss.rr.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	private static final String EXCEL_XLS = "xls";
	private static final String EXCEL_XLSX = "xlsx";

	public static void main(String[] args) throws IOException {
		ReadExcel obj = new ReadExcel();
		File file = new File("D://readExcel.xlsx");
		Workbook wb = ReadExcel.getWorkbok(file);
		ArrayList<ArrayList<ArrayList<ArrayList<String>>>> bookList = obj.readExcel(wb);
		for(int i = 0;i<bookList.size();i++){
			ArrayList<ArrayList<ArrayList<String>>> sheetList = bookList.get(i);
			for(int j = 0;j<sheetList.size();j++){
				ArrayList<ArrayList<String>> rowList = sheetList.get(j);
				for(int k =0;k<rowList.size();k++){
					ArrayList<String> list = rowList.get(k);
					for(int l = 0;l<list.size();l++){
						String content = list.get(l);
						System.out.print(content+" ");
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}

	}

	public ArrayList<ArrayList<ArrayList<ArrayList<String>>>> readExcel(Workbook wb) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<ArrayList<String>> rowList = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<ArrayList<String>>> sheetList = new ArrayList<ArrayList<ArrayList<String>>>();
		ArrayList<ArrayList<ArrayList<ArrayList<String>>>> bookList = new ArrayList<ArrayList<ArrayList<ArrayList<String>>>>();
		// ��ȡsheet������
		int numberOfSheets = wb.getNumberOfSheets();
		for(int i = 0;i < numberOfSheets;i++){
			//��ȡsheet����
			Sheet sheet = wb.getSheetAt(i);
			// ��ȡ����
			int lastRowNum = sheet.getLastRowNum();
			for(int j = 0;j <= lastRowNum;j++){
				// ��ȡ�ж���
				Row row = sheet.getRow(j);
				// ��ȡ����
				short lastCellNum = row.getLastCellNum();
				for(int k = 0 ;k < lastCellNum;k++){
					// ��ȡһ����ÿ�е�����
					Cell cell = row.getCell(k);
					// �����ݷ���list������
					list.add(cell.toString());
					// ��������һ��
					if(k == lastCellNum - 1){
						// ��list����rowList�����У����½�һ��list����
						rowList.add(list);
						list = new ArrayList<String>();
					}
				}
				sheetList.add(rowList);
				rowList = new ArrayList<ArrayList<String>>();
			}
			bookList.add(sheetList);
			sheetList = new ArrayList<ArrayList<ArrayList<String>>>();
		}
		return bookList;

    }

    /**
     * �ж�Excel�İ汾,��ȡWorkbook
     * @param in
     * @param filename
     * @return
     * @throws IOException
     */
    public static Workbook getWorkbok(File file) throws IOException{
        Workbook wb = null;
        FileInputStream in = new FileInputStream(file);
        if(file.getName().endsWith(EXCEL_XLS)){     //Excel&nbsp;2003
            wb = new HSSFWorkbook(in);
        }else if(file.getName().endsWith(EXCEL_XLSX)){    // Excel 2007/2010
            wb = new XSSFWorkbook(in);
        }
        return wb;
    }
}