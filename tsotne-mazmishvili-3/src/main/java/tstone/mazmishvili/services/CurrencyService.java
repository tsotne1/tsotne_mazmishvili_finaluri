package tstone.mazmishvili.services;

import tstone.mazmishvili.model.Currency;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Date;

@WebService
public class CurrencyService {

    @WebMethod
    public String GetCurrency(Currency cur){
            double currency = cur.getCurrency();
            return ("" + currency + "");

    }

    @WebMethod
    public String GetCurrencyDescription(Currency cur){
        return cur.getDescription();
    }

    @WebMethod
    public Date GetDate(){
        Date date = new Date(2000, 11, 21);
        return date;
    }
}
