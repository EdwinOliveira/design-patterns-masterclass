package patterns.behavioral.templateMethod;

import java.util.Date;

public class ErrorLog extends LogTemplate {
    @Override
    protected void getBeforeTime() {
        System.out.println(new Date());
    }

    @Override
    protected void getAfterTime() {
        System.out.println(new Date());
    }
}
