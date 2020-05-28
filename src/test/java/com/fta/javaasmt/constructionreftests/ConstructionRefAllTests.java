package com.fta.javaasmt.constructionreftests;


import com.fta.javaasmt.withoutlambdaexpression.Employee;
import com.fta.javaasmt.withoutlambdaexpression.IEmp;
import org.testng.annotations.Test;

public class ConstructionRefAllTests {
    @Test
    public void test() {

        IEmp.IEmpObj iEmpObj1 = Employee::new;
        System.out.println(iEmpObj1.get("test_1", "acc", 456.77));
        System.out.println();
    }
}
