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

#### FULL STACKTRACES

```
X509Certificate
---------------
sun.security.provider.X509Factory.commitEvent(X509CertImpl) line: 794,     
sun.security.provider.X509Factory.engineGenerateCertificate(InputStream) line: 108,     
java.security.cert.CertificateFactory.generateCertificate(InputStream) line: 355,     
sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(ClientHandshakeContext, List) line: 1291,     
sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(ClientHandshakeContext, CertificateMessage$T13CertificateMessage) line: 1207,     
sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(ConnectionContext, ByteBuffer) line: 1154,    
sun.security.ssl.SSLHandshake.consume(ConnectionContext, ByteBuffer) line: 396,     
sun.security.ssl.HandshakeContext.dispatch(byte, ByteBuffer) line: 444,     
sun.security.ssl.SSLEngineImpl$DelegatedTask$DelegatedAction.run() line: 1260,     
sun.security.ssl.SSLEngineImpl$DelegatedTask$DelegatedAction.run() line: 1247,     
java.security.AccessController.executePrivileged(PrivilegedExceptionAction, AccessControlContext, Class) line: 784,     
java.security.AccessController.doPrivileged(PrivilegedExceptionAction, AccessControlContext) line: 691,     
sun.security.ssl.SSLEngineImpl$DelegatedTask.run() line: 1192,     
jdk.internal.net.http.common.SSLFlowDelegate$$Lambda$215.1624064509.accept(Object),     
java.util.ArrayList.forEach(Consumer) line: 1510,     
jdk.internal.net.http.common.SSLFlowDelegate.lambda$executeTasks$3(List) line: 1109,     
jdk.internal.net.http.common.SSLFlowDelegate$$Lambda$214.2081681142.run(),     
jdk.internal.net.http.HttpClientImpl$DelegatingExecutor.execute(Runnable) line: 155,     
jdk.internal.net.http.common.SSLFlowDelegate.executeTasks(List) line: 1104,     
jdk.internal.net.http.common.SSLFlowDelegate.doHandshake(SSLFlowDelegate$EngineResult, int) line: 1070,     
jdk.internal.net.http.common.SSLFlowDelegate$Reader.processData() line: 474,     
jdk.internal.net.http.common.SSLFlowDelegate$Reader$ReaderDownstreamPusher.run() line: 264,     
jdk.internal.net.http.common.SequentialScheduler$SynchronizedRestartableTask.run() line: 175,     
jdk.internal.net.http.common.SequentialScheduler$CompleteRestartableTask.run(SequentialScheduler$DeferredCompleter) line: 147,     
jdk.internal.net.http.common.SequentialScheduler$SchedulableTask.run() line: 198,     
java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor$Worker) line: 1130,     
java.util.concurrent.ThreadPoolExecutor$Worker.run() line: 630,     
java.lang.Thread.run() line: 832

X509Validation
--------------
sun.security.provider.certpath.PKIXCertPathValidator.validate(TrustAnchor, PKIX$ValidatorParams) line: 253,     
sun.security.provider.certpath.PKIXCertPathValidator.validate(PKIX$ValidatorParams) line: 145,     
sun.security.provider.certpath.PKIXCertPathValidator.engineValidate(CertPath, CertPathParameters) line: 84,     
java.security.cert.CertPathValidator.validate(CertPath, CertPathParameters) line: 309,    
sun.security.validator.PKIXValidator.doValidate(X509Certificate[], PKIXBuilderParameters) line: 345,     
sun.security.validator.PKIXValidator.engineValidate(X509Certificate[], Collection, List, AlgorithmConstraints, Object) line: 259,     
sun.security.validator.Validator.validate(X509Certificate[], Collection, List, AlgorithmConstraints, Object) line: 264,     
sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509Certificate[], String, SSLEngine, boolean) line: 285,     
sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509Certificate[], String, SSLEngine) line: 144,     
sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(ClientHandshakeContext, List) line: 1310,     
sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(ClientHandshakeContext, CertificateMessage$T13CertificateMessage) line: 1207,     sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(ConnectionContext, ByteBuffer) line: 1154,     sun.security.ssl.SSLHandshake.consume(ConnectionContext, ByteBuffer) line: 396,     sun.security.ssl.HandshakeContext.dispatch(byte, ByteBuffer) line: 444,     sun.security.ssl.SSLEngineImpl$DelegatedTask$DelegatedAction.run() line: 1260,     
sun.security.ssl.SSLEngineImpl$DelegatedTask$DelegatedAction.run() line: 1247,     
java.security.AccessController.executePrivileged(PrivilegedExceptionAction, AccessControlContext, Class) line: 784,     
java.security.AccessController.doPrivileged(PrivilegedExceptionAction, AccessControlContext) line: 691,     
sun.security.ssl.SSLEngineImpl$DelegatedTask.run() line: 1192,     
jdk.internal.net.http.common.SSLFlowDelegate$$Lambda$215.627181723.accept(Object),     
java.util.ArrayList.forEach(Consumer) line: 1510,     
jdk.internal.net.http.common.SSLFlowDelegate.lambda$executeTasks$3(List) line: 1109,     
jdk.internal.net.http.common.SSLFlowDelegate$$Lambda$214.410888346.run(),     
jdk.internal.net.http.HttpClientImpl$DelegatingExecutor.execute(Runnable) line: 155,     
jdk.internal.net.http.common.SSLFlowDelegate.executeTasks(List) line: 1104,     
jdk.internal.net.http.common.SSLFlowDelegate.doHandshake(SSLFlowDelegate$EngineResult, int) line: 1070,     
jdk.internal.net.http.common.SSLFlowDelegate$Reader.processData() line: 474,     
jdk.internal.net.http.common.SSLFlowDelegate$Reader$ReaderDownstreamPusher.run() line: 264,     
jdk.internal.net.http.common.SequentialScheduler$SynchronizedRestartableTask.run() line: 175,     
jdk.internal.net.http.common.SequentialScheduler$CompleteRestartableTask.run(SequentialScheduler$DeferredCompleter) line: 147,     
jdk.internal.net.http.common.SequentialScheduler$SchedulableTask.run() line: 198,     
java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor$Worker) line: 1130,     
java.util.concurrent.ThreadPoolExecutor$Worker.run() line: 630,     
java.lang.Thread.run() line: 832

TLSHandshake
------------
sun.security.ssl.Finished.recordEvent(SSLSessionImpl) line: 1136,     
sun.security.ssl.Finished$T13FinishedProducer.onProduceFinished(ClientHandshakeContext, SSLHandshake$HandshakeMessage) line: 753,     
sun.security.ssl.Finished$T13FinishedProducer.produce(ConnectionContext, SSLHandshake$HandshakeMessage) line: 658,    
sun.security.ssl.SSLHandshake.produce(ConnectionContext, SSLHandshake$HandshakeMessage) line: 440,     
sun.security.ssl.Finished$T13FinishedConsumer.onConsumeFinished(ClientHandshakeContext, ByteBuffer) line: 1001,     
sun.security.ssl.Finished$T13FinishedConsumer.consume(ConnectionContext, ByteBuffer) line: 876,     
sun.security.ssl.SSLHandshake.consume(ConnectionContext, ByteBuffer) line: 396,     
sun.security.ssl.HandshakeContext.dispatch(byte, ByteBuffer) line: 444,     
sun.security.ssl.HandshakeContext.dispatch(byte, Plaintext) line: 419,     
sun.security.ssl.TransportContext.dispatch(Plaintext) line: 181,    
sun.security.ssl.SSLTransport.decode(TransportContext, ByteBuffer[], int, int, ByteBuffer[], int, int) line: 167,     
sun.security.ssl.SSLEngineImpl.decode(ByteBuffer[], int, int, ByteBuffer[], int, int) line: 729,     
sun.security.ssl.SSLEngineImpl.readRecord(ByteBuffer[], int, int, ByteBuffer[], int, int) line: 684,     
sun.security.ssl.SSLEngineImpl.unwrap(ByteBuffer[], int, int, ByteBuffer[], int, int) line: 499,     
sun.security.ssl.SSLEngineImpl.unwrap(ByteBuffer, ByteBuffer[], int, int) line: 475,     
javax.net.ssl.SSLEngine.unwrap(ByteBuffer, ByteBuffer) line: 634,     
jdk.internal.net.http.common.SSLFlowDelegate$Reader.unwrapBuffer(ByteBuffer) line: 517,     
jdk.internal.net.http.common.SSLFlowDelegate$Reader.processData() line: 423,     
jdk.internal.net.http.common.SSLFlowDelegate$Reader$ReaderDownstreamPusher.run() line: 264,     
jdk.internal.net.http.common.SequentialScheduler$SynchronizedRestartableTask.run() line: 175,     
jdk.internal.net.http.common.SequentialScheduler$CompleteRestartableTask.run(SequentialScheduler$DeferredCompleter) line: 147,     
jdk.internal.net.http.common.SequentialScheduler$TryEndDeferredCompleter.complete() line: 315,     
jdk.internal.net.http.common.SequentialScheduler$CompleteRestartableTask.run(SequentialScheduler$DeferredCompleter) line: 149,     
jdk.internal.net.http.common.SequentialScheduler$SchedulableTask.run() line: 198,     
java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor$Worker) line: 1130,    
java.util.concurrent.ThreadPoolExecutor$Worker.run() line: 630,     
java.lang.Thread.run() line: 832
```