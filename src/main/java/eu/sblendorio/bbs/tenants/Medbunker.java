package eu.sblendorio.bbs.tenants;

public class Medbunker extends GoogleBloggerProxy {

    public Medbunker() {
        super();
        this.logo = LOGO;
        this.blogUrl = "https://medbunker.blogspot.com";
        this.pageSize = 10;
        this.screenRows = 19;
    }

    private static final byte[] LOGO = new byte[] {
        5, -68, 18, -68, -110, -84, 18, -84, -110, 32, 32, 32, 32, 18, -69, -110,
        32, 18, -69, -94, -110, -69, 32, 32, 32, 32, 32, 32, -68, -95, -84, -69,
        32, 32, 32, 32, 32, 18, -97, -95, -110, -51, 69, 68, 73, 67, 73, 78,
        65, 13, 32, 5, -95, -66, -95, 32, -94, 32, -84, 18, -66, -110, 32, 18,
        -95, -110, -94, -66, -94, -84, -69, -94, -94, 32, 32, 18, -68, -110, -66, 32,
        -84, -69, -84, -69, -69, 18, -97, -95, -110, -45, 67, 73, 69, 78, 90, 65,
        13, 32, 5, -95, 32, -95, 18, -95, -65, -110, -66, -95, 18, -95, -110, 32,
        18, -95, -110, 32, -95, 18, -95, -110, 32, -95, 18, -95, -110, 32, -95, 32,
        -95, -65, 32, 18, -68, -94, -110, 32, 18, -84, -110, 32, 18, -97, -95, -110,
        -61, 73, 65, 82, 76, 65, 84, 65, 78, 73, 13, 5, -68, -66, 32, 18,
        -94, -110, 32, 18, -94, -110, 32, -68, 18, -94, -110, -66, 18, -94, -94, -110,
        32, 32, 18, -94, -110, -66, 18, -94, -110, 32, 18, -94, -110, -68, -66, -68,
        -66, -68, -66, -68, 18, -94, -110, 32, -97, -68, 18, -94, -94, -94, -94, -94,
        -94, -94, -94, -94, -94, -110, 13
    };

}
