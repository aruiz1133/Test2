package starter;

public enum WebServiceEndPoints {
    STATUS("http://localhost:8080/api/status"),
    TRADE("http://localhost:8080/api/trade"),
    M1("http://172.28.65.43:10101/api/VerificacionCoberturaCliente"),
    M3("http://172.28.65.43:10101/api/Radicaciones"),
    M10("http://172.28.65.43:10101/api/SoportesImagen"),
    M13("http://172.28.65.43:10101/api/Diagnosticos"),
    M5("http://172.28.65.43:10101/api/Accidentes"),
    M11("http://172.28.65.43:10101/api/Autorizaciones"),
    M2("http://172.28.65.43:10101/api/MarcacionesContrato"),
    M7("http://172.28.65.43:10101/api/Autorizaciones"),
    M12("http://172.28.65.43:10101/api/Casos"),
    M15("http://172.28.65.43:10101/api/Autorizaciones/Informes"),
    M14("http://172.28.65.43:10101/api/Direccionamientos")
 
    ;

    private final String url;

    WebServiceEndPoints(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
