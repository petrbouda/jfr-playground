# CERTIFICATES

```java
public class Certificates {

    public static void main(String[] args) throws InterruptedException {
        Jfr.start("jdk.TLSHandshake", "jdk.X509Validation", "jdk.X509Certificate");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.google.cz/"))
                .build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }
}
```

#### X509_CERTIFICATE

- a list of load certificates

```
jdk.X509Certificate {
  startTime = 16:45:28.491
  algorithm = "SHA256withRSA"
  serialNumber = "570a119742c4e3cc"
  subject = "CN=Actalis Authentication Root CA, O=Actalis S.p.A./03358520967, L=Milan, C=IT"
  issuer = "CN=Actalis Authentication Root CA, O=Actalis S.p.A./03358520967, L=Milan, C=IT"
  keyType = "RSA"
  keyLength = 4096
  certificateId = 1729119956
  validFrom = 12:22:02.000
  validUntil = 12:22:02.000
  eventThread = "main" (javaThreadId = 1)
  stackTrace = [
    sun.security.provider.X509Factory.commitEvent(X509CertImpl) line: 794
    sun.security.provider.X509Factory.engineGenerateCertificate(InputStream) line: 108
    java.security.cert.CertificateFactory.generateCertificate(InputStream) line: 355
    sun.security.provider.JavaKeyStore.engineLoad(InputStream, char[]) line: 766
    sun.security.util.KeyStoreDelegator.engineLoad(InputStream, char[]) line: 241
    ...
  ]
}


jdk.X509Certificate {
  startTime = 16:45:28.494
  algorithm = "SHA1withRSA"
  serialNumber = "1"
  subject = "CN=AddTrust Class 1 CA Root, OU=AddTrust TTP Network, O=AddTrust AB, C=SE"
  issuer = "CN=AddTrust Class 1 CA Root, OU=AddTrust TTP Network, O=AddTrust AB, C=SE"
  keyType = "RSA"
  keyLength = 2048
  certificateId = 764620144
  validFrom = 11:38:31.000
  validUntil = 11:38:31.000
  eventThread = "main" (javaThreadId = 1)
  stackTrace = [
    sun.security.provider.X509Factory.commitEvent(X509CertImpl) line: 794
    sun.security.provider.X509Factory.engineGenerateCertificate(InputStream) line: 108
    java.security.cert.CertificateFactory.generateCertificate(InputStream) line: 355
    sun.security.provider.JavaKeyStore.engineLoad(InputStream, char[]) line: 766
    sun.security.util.KeyStoreDelegator.engineLoad(InputStream, char[]) line: 241
    ...
  ]
}

...
```

#### X509_VALIDATION

- `certificateId` shows ID to the certificate which is being validated

```
jdk.X509Validation {
  startTime = 16:49:05.027
  certificateId = 7087067
  certificatePosition = 1
  validationCounter = 1
  eventThread = "HttpClient-1-Worker-0" (javaThreadId = 17)
  stackTrace = [
    sun.security.provider.certpath.PKIXCertPathValidator.validate(TrustAnchor, PKIX$ValidatorParams) line: 253
    sun.security.provider.certpath.PKIXCertPathValidator.validate(PKIX$ValidatorParams) line: 145
    sun.security.provider.certpath.PKIXCertPathValidator.engineValidate(CertPath, CertPathParameters) line: 84
    java.security.cert.CertPathValidator.validate(CertPath, CertPathParameters) line: 309
    sun.security.validator.PKIXValidator.doValidate(X509Certificate[], PKIXBuilderParameters) line: 345
    ...
  ]
}


jdk.X509Validation {
  startTime = 16:49:05.027
  duration = 0.127 ms
  certificateId = 1544128074
  certificatePosition = 2
  validationCounter = 1
  eventThread = "HttpClient-1-Worker-0" (javaThreadId = 17)
  stackTrace = [
    sun.security.provider.certpath.PKIXCertPathValidator.validate(TrustAnchor, PKIX$ValidatorParams) line: 258
    sun.security.provider.certpath.PKIXCertPathValidator.validate(PKIX$ValidatorParams) line: 145
    sun.security.provider.certpath.PKIXCertPathValidator.engineValidate(CertPath, CertPathParameters) line: 84
    java.security.cert.CertPathValidator.validate(CertPath, CertPathParameters) line: 309
    sun.security.validator.PKIXValidator.doValidate(X509Certificate[], PKIXBuilderParameters) line: 345
    ...
  ]
}


jdk.X509Validation {
  startTime = 16:49:05.027
  duration = 0.127 ms
  certificateId = 1709352777
  certificatePosition = 3
  validationCounter = 1
  eventThread = "HttpClient-1-Worker-0" (javaThreadId = 17)
  stackTrace = [
    sun.security.provider.certpath.PKIXCertPathValidator.validate(TrustAnchor, PKIX$ValidatorParams) line: 258
    sun.security.provider.certpath.PKIXCertPathValidator.validate(PKIX$ValidatorParams) line: 145
    sun.security.provider.certpath.PKIXCertPathValidator.engineValidate(CertPath, CertPathParameters) line: 84
    java.security.cert.CertPathValidator.validate(CertPath, CertPathParameters) line: 309
    sun.security.validator.PKIXValidator.doValidate(X509Certificate[], PKIXBuilderParameters) line: 345
    ...
  ]
}
```

#### TLS_HANDSHAKE

```
jdk.TLSHandshake {
  startTime = 16:49:05.078
  peerHost = "www.google.cz"
  peerPort = 443
  protocolVersion = "TLSv1.3"
  cipherSuite = "TLS_AES_256_GCM_SHA384"
  certificateId = 1709352777
  eventThread = "HttpClient-1-Worker-0" (javaThreadId = 17)
  stackTrace = [
    sun.security.ssl.Finished.recordEvent(SSLSessionImpl) line: 1136
    sun.security.ssl.Finished$T13FinishedProducer.onProduceFinished(ClientHandshakeContext, SSLHandshake$HandshakeMessage) line: 753
    sun.security.ssl.Finished$T13FinishedProducer.produce(ConnectionContext, SSLHandshake$HandshakeMessage) line: 658
    sun.security.ssl.SSLHandshake.produce(ConnectionContext, SSLHandshake$HandshakeMessage) line: 440
    sun.security.ssl.Finished$T13FinishedConsumer.onConsumeFinished(ClientHandshakeContext, ByteBuffer) line: 1001
    ...
  ]
}
```