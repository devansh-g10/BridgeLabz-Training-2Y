interface Exporter {
    void exportToCSV();
    void exportToPDF();
    
    default void exportToJSON() {
        System.out.println("Exporting to JSON...");
    }
}
