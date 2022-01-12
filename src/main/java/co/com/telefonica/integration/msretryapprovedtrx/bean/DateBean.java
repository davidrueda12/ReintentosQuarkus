package co.com.telefonica.integration.msretryapprovedtrx.bean;

import java.util.Date;

/**
 *
 * @author Red Hat
 *
 */
public class DateBean {

    public static String calculateDate(Date beginDate, Date endDate) {
        Double before = Double.valueOf(String.valueOf(beginDate.getTime()));
        Double after = Double.valueOf(String.valueOf(endDate.getTime()));
        Double result = (after - before) / 1000;
        return String.valueOf(result).concat("s");
    }

    private DateBean() {
    }
}
