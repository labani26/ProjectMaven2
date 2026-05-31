package ObjectRepoTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import BestSellerExcelData.ExcelDataForBestSeller;
import ObjectRepo.HomePageTest;
import exp.ProjectMaven2.BrowserMainTest;

public class CheckBestSellerItem {

    WebDriver driver;

    public void CheckBestSeller(String firefox) throws IOException {

        BrowserMainTest browser = new BrowserMainTest();

        browser.BrowserOpen(firefox);

        HomePageTest BestSellerSection = new HomePageTest(driver);

        String Product1 = BestSellerSection.bestSeller().getText();
        String Product2 = BestSellerSection.bestSeller1().getText();
        String Product3 = BestSellerSection.bestSeller2().getText();
        String Product4 = BestSellerSection.bestSeller3().getText();

        ExcelDataForBestSeller Exceldata = new ExcelDataForBestSeller();

        String ExcelProduct1 = Exceldata.readData(1, 1);
        String ExcelProduct2 = Exceldata.readData(2, 1);
        String ExcelProduct3 = Exceldata.readData(3, 1);
        String ExcelProduct4 = Exceldata.readData(4, 1);

        for (int i = 1; i <= 4; i++) {

            if (i == 1) {

                if (Product1.equals(ExcelProduct1)) {
                    Exceldata.writeData(i, 1, "valid");
                } else {
                    Exceldata.writeData(i, 1, "invalid");
                }
            }

            if (i == 2) {

                if (Product2.equals(ExcelProduct2)) {
                    Exceldata.writeData(i, 2, "valid");
                } else {
                    Exceldata.writeData(i, 2, "invalid");
                }
            }

            if (i == 3) {

                if (Product3.equals(ExcelProduct3)) {
                    Exceldata.writeData(i, 3, "valid");
                } else {
                    Exceldata.writeData(i, 3, "invalid");
                }
            }

            if (i == 4) {

                if (Product4.equals(ExcelProduct4)) {
                    Exceldata.writeData(i, 4, "valid");
                } else {
                    Exceldata.writeData(i, 4, "invalid");
                }
            }
        }
    }
}