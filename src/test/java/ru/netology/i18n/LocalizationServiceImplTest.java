package ru.netology.i18n;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.entity.Country;

public class LocalizationServiceImplTest {
    private static final String TEXT_RUSSIA = "Добро пожаловать";
    private static final String TEXT_USA = "Welcome";
    LocalizationServiceImpl localizationService = new LocalizationServiceImpl();

    @Test
    public void shouldReturnRuss() {
        Assertions.assertEquals(TEXT_RUSSIA, localizationService.locale(Country.RUSSIA));
    }

    @Test
    public void shouldReturnUSA() {
        Assertions.assertEquals(TEXT_USA, localizationService.locale(Country.USA));
    }
}
