/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package signing;

import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.ECDSASigner;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import picocli.CommandLine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyPair;
import java.security.Security;
import java.security.interfaces.ECPrivateKey;

public class App {
    private static final String KID = "1f060641-f776-4ca9-978c-f0836a173c81";
    private static final String PAYLOAD = "{\"amount_in_minor\":1,\"beneficiary_iban\":\"GB98CLRB04066800000457\",\"beneficiary_name\":\"Andrea Di Lisio\",\"beneficiary_reference\":\"Sandbox pot\",\"context_code\":\"withdrawal\",\"currency\":\"GBP\",\"transaction_id\":\"b589ef0c-d6e5-418b-b6b3-a5db14c8ed0d\"}";

    public static void main(String[] args) throws IOException, JOSEException {
        CommandLine commandLine = new CommandLine(new RequestSigner());

        if (args.length == 0) {
            commandLine.usage(System.out);
            return;
        }

        int exitCode = commandLine.execute(args);
        System.exit(exitCode);
    }
}
