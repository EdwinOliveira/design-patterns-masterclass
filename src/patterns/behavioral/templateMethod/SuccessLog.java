package patterns.behavioral.templateMethod;

import java.util.Date;

public class SuccessLog extends LogTemplate {
    @Override
    protected void getBeforeTime() {
        System.out.println(new Date());
    }

    @Override
    protected void getAfterTime() {
        System.out.println(new Date());
    }
}
