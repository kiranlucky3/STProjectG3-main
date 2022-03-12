package G3Converter;

import java.util.HashMap;

public class Unit {
    /* ************ */
    /*  UNIT NAMES  */
    /* ************ */

    // Distance units
    public static String MILLIMETERS = "Millimeters";  // mm
    public static String CENTIMETERS = "Centimeters";  // cm
    public static String METERS = "Meters";            // m
    public static String KILOMETERS = "Kilometers";    // km
    public static String INCHES = "Inches";            // in
    public static String FEET = "Feet";                // ft
    public static String YARDS = "Yards";              // yd
    public static String MILES = "Miles";              // mi

    // Weight units
    public static String GRAMS = "GRAMS";  // mm
    public static String KILOGRAMS = "KILOGRAMS";  // cm
    public static String TONNES = "TONNES";
    public static String MICROGRAMS = "MICROGRAMS";// m
    public static String MILLIGRAMS = "MILLIGRAMS";    // km

    // Currency units
    public static String DOLLARS = "Dollars";
    public static String EURO = "Euro";
    public static String SWCROWNS = "Swedish Crown";
    public static String JPYEN = "Japanese Yen";

    /* *********************** */
    /*  UNIT ASSOCIATION LIST  */
    /* *********************** */
    // For cleaner development in UnitConverter extended classes. You can use the HashMap.ContainsKey() method to check
    // user input.

    // Distance association list
    public static HashMap<String, Integer> DISTANCE_ASSOCIATION_LIST = new HashMap<String, Integer>();
    static {
        DISTANCE_ASSOCIATION_LIST.put(MILLIMETERS, 0);
        DISTANCE_ASSOCIATION_LIST.put(CENTIMETERS, 1);
        DISTANCE_ASSOCIATION_LIST.put(METERS, 2);
        DISTANCE_ASSOCIATION_LIST.put(KILOMETERS, 3);
        DISTANCE_ASSOCIATION_LIST.put(INCHES, 4);
        DISTANCE_ASSOCIATION_LIST.put(FEET, 5);
        DISTANCE_ASSOCIATION_LIST.put(YARDS, 6);
        DISTANCE_ASSOCIATION_LIST.put(MILES, 7);
    }
    // Weight association list
    public static HashMap<String, Integer> WEIGHT_ASSOCIATION_LIST = new HashMap<String, Integer>();
    static {
        WEIGHT_ASSOCIATION_LIST.put(GRAMS, 0);
        WEIGHT_ASSOCIATION_LIST.put(KILOGRAMS, 1);
        WEIGHT_ASSOCIATION_LIST.put(TONNES, 2);
        WEIGHT_ASSOCIATION_LIST.put(MICROGRAMS, 3);
        WEIGHT_ASSOCIATION_LIST.put(MILLIGRAMS, 4);

    }
    // Currency association list
    public static HashMap<String, Integer> CURRENCY_ASSOCIATION_LIST = new HashMap<String, Integer>();
        static {
            CURRENCY_ASSOCIATION_LIST.put(DOLLARS, 0);
            CURRENCY_ASSOCIATION_LIST.put(EURO, 1);
            CURRENCY_ASSOCIATION_LIST.put(JPYEN, 2);
            CURRENCY_ASSOCIATION_LIST.put(SWCROWNS, 3);
        }
    /* ********************* */
    /*  CONVERSION MATRICES  */
    /* ********************* */
    // From https://www.isa.org/getmedia/192f7bda-c77c-480a-8925-1a39787ed098/CCST-Conversions-document.pdf

    // Distance matrix
    public static double[][] DISTANCE_MATRIX = {
    //   mm         cm        m         km        in        ft        yd        mi
        {1.0,       0.1,      0.001,    0.000001, 0.03937,  0.003281, 0.001094, 6.21e-07},
        {10.0,      1.0,      0.01,     0.00001,  0.393701, 0.032808, 0.010936, 0.000006},
        {1000.0,    100.0,    1.0,      0.001,    39.37008, 3.28084,  1.093613, 0.000621},
        {1000000.0, 100000.0, 1000.0,   1.0,      39370.08, 3280.84,  1093.613, 0.621371},
        {25.4,      2.54,     0.0254,   0.000025, 1.0,      0.083333, 0.027778, 0.000016},
        {304.8,     30.48,    0.3048,   0.000305, 12.0,     1.0,      0.333333, 0.000189},
        {914.4,     91.44,    0.9144,   0.000914, 36.0,     3.0,      1.0,      0.000568},
        {1609344.0, 160934.4, 1609.344, 1.609344, 63360.0,  5280.0,   1760.0,   1.0     }
    };

    // Weight matrix
    public static double[][] WEIGHT_MATRIX = {
            //   G         Kg        ton         mic       mil
            {1.0,       0.001,      0.000001,    1000000, 1000},
            {10.0,      0.01,      0.00001,     10000000,  10000},
            {3,    0.003,    0.000003,      3000000,    3000},
            {0.0021, 0.0000021, 0.00000000021, 2100, 2.1},
            {600,     0.6,    0.000006,   600000000, 600000},
            {2100, 2.1, 0.0021, 21000000000.0, 2100000}

    };

    // Currency matrix
    // Source: https://www.xe.com/currencyconverter/
    public static double[][] CURRENCY_MATRIX = {
    //   Dollar     Euro      Yen       Crowns
        {1.0,       0.905,    115.74,   9.707},
        {0.905,     1.0,      128.03,   10.64},
        {0.008,     0.007,    1.0,      0.083},
        {0.10,      0.093,    12.03,    1.0}
    };
}
