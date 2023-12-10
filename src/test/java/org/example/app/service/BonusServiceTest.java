package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    private BonusService bonusService;

    @BeforeEach
    void setUp() {
        bonusService = new BonusService();
    }

    @Test
    @DisplayName("Expected test")
    void getRes_ok() {
        assertEquals("0,23", bonusService.getRes(2.3456d));

    }
    @Test
    @DisplayName("Unexpected test")
    void getRes_invalid_value() {
        assertEquals("Incorrect value!", bonusService.getRes(0.0d));
        assertEquals("Incorrect value!", bonusService.getRes(-30.0d));
    }

    @AfterEach
    void tearDown() {

    }
}