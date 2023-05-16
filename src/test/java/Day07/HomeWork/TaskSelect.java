package Day07.HomeWork;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskSelect extends Base {
    /* Go to URL: https://demoqa.com/select-menu
     Get all the options of the dropdown
     Options size
     Print all test
     Verify the dropdown has option "Black"
     Print FirstSelectedOptionTest
     Select option "Yellow"*/
    @Test
    public void TaskSelect() {
        driver.get("https://demoqa.com/select-menu");
        WebElement multiSelect=driver.findElement(By.id("oldSelectMenu"));
        Select sc=new Select(multiSelect);
        List<WebElement> options=sc.getOptions();
        List<String> optionvalues=new ArrayList<String>();
        for (WebElement opt:options) {
            optionvalues.add(opt.getText());
        }
        System.out.println(optionvalues.size());
        System.out.println(optionvalues);
        Assert.assertTrue(optionvalues.contains("Black"));
        sc.selectByIndex(3);

    }
}