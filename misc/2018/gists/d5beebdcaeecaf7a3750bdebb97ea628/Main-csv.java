package io.github.picodotdev.blogbitix.holamundoapachepoi;

...

public class Main {

    private static List<Object> DATA;

    static {
        DATA = Arrays.asList(new Object[] {
            new Object[] { "PlayStation 4 (PS4) - Consola 500GB", new BigDecimal("340.95"), "https://www.amazon.es/PlayStation-4-PS4-Consola-500GB/dp/B013U9CW8A" },
            new Object[] { "Raspberry Pi 3 Modelo B (1,2 GHz Quad-core ARM Cortex-A53, 1GB RAM, USB 2.0)", new BigDecimal("41.95"), "https://www.amazon.es/Raspberry-Modelo-GHz-Quad-core-Cortex-A53/dp/B01CD5VC92/" },
            new Object[] { "Gigabyte Brix - Barebón (Intel, Core i5, 2,6 GHz, 6, 35 cm (2.5\"), Serial ATA III, SO-DIMM) Negro ", new BigDecimal("421.36"), "https://www.amazon.es/Gigabyte-Brix-Bareb%C3%B3n-Serial-SO-DIMM/dp/B00HFCTUPM/" }
        });
    }

    public static void main(String[] args) throws Exception {
        writeExcel();
        readExcel();

        writeCsv();
        readCsv();
    }

    ...

    private static void readCsv() throws Exception {
        CSVReader reader = new CSVReader(new FileReader("data.csv"));
        List<String[]> lines = reader.readAll();

        System.out.println();
        lines.forEach(d -> {
            String product = (String) d[0];
            BigDecimal price = new BigDecimal(d[1]);
            String link = (String) d[2];

            System.out.printf("%s, %s, %s%n", product, price.toString(), link);
        });

        reader.close();
    }
}

