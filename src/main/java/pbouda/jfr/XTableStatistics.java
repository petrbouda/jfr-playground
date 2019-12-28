package pbouda.jfr;

public class XTableStatistics {

    public static void main(String[] args) {
        Jfr.start("jdk.SymbolTableStatistics",
                "jdk.StringTableStatistics",
                "jdk.PlaceholderTableStatistics",
                "jdk.LoaderConstraintsTableStatistics",
                "jdk.ProtectionDomainCacheTableStatistics");
    }

}
