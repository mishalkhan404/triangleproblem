/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangleproblem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;


import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


/**
 *
 * @author 4star
 */
@RunWith(Parameterized.class)
public class TriangleproblemIT {
    private int L1;
	private int L2;
	private int L3;
	private String ExpResult;
        Triangleproblem object;
    public TriangleproblemIT(String a,int L1,int L2,int L3) {
        ExpResult=a;
		this.L1=L1;
		this.L2=L2;
		this.L3=L3;
    }
    
    @Before
    public void setUp() {
        object=new Triangleproblem();
    }
    
    @After
    public void tearDown() {
    }
    @Parameterized.Parameters
	public static Collection<Object[]> Testdata() throws BiffException, IOException, IllegalArgumentException
	{ 
		
			FileInputStream file;
			int j=0;
				file = new FileInputStream("test (1).xls");
				Workbook wbk = Workbook.getWorkbook(file);
				  Sheet sheet = wbk.getSheet(0);
				  Object Data[][] = new Object[sheet.getRows()][sheet.getColumns()];
				  for(int i=0;i<(sheet.getRows());i++)
				  {
				   String r=sheet.getCell(0,i).getContents();
				   int l=Integer.parseInt(sheet.getCell(1,i).getContents());
				   int ll=Integer.parseInt(sheet.getCell(2,i).getContents());
				   int lll=Integer.parseInt(sheet.getCell(3,i).getContents());
				    Data[i][0] = r;
				    Data[i][1] = l;
				   Data[i][2] = ll;
				  Data[i][3] = lll;
				    
				    
				  }
				    
			
			 return Arrays.asList(Data);
	    
	}

    /**
     * Test of TriangleCheck method, of class Triangleproblem.
     */
    @Test
    public void testTriangleproblem() {
        System.out.println("TriangleCheck");
        Assert.assertEquals(ExpResult,object.TriangleCheck(L1,L2,L3));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
