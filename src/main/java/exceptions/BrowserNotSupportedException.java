package exceptions;

import data.DriverData;
import io.github.bonigarcia.wdm.config.DriverManagerType;

import java.util.Locale;

public class BrowserNotSupportedException extends Exception {
    public BrowserNotSupportedException(DriverManagerType browserType){
        super(String.format("Browser %s not supported", browserType.name().toLowerCase(Locale.ROOT)));
    }
}
