package dbsecure;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@Configuration //내가 설정 클래스다
@EnableEncryptableProperties //현재 정보를 application.properties파일에서 사용가능
public class DBConfig {
	@Bean("jasyptEncryptor") //메소드 리턴 객체 주입
	public StringEncryptor stringEncryptor() {
		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(System.getenv("DB_PASSWORD"));
        config.setAlgorithm("PBEWithMD5AndDES"); // 알고리즘
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");
        encryptor.setConfig(config);
        
        System.out.println("===DBConfig 출력 ===");
        System.out.println(System.getenv("DB_PASSWORD"));
        System.out.println(encryptor.decrypt("LDVQjFq+62p+2CDlaAJ4VzlwHw2ZvSDh7BDR6RSyhSU="));
        System.out.println(encryptor.decrypt("L9+jo18Y3qfz66GFk1vcfA6z6MH9Ul3ni//8+CiaPRuRrYbEQYcoLlfmtXCqFj3Ineu6qAJbOI4cmkjVDUg/Fvqz8QhMRBqKkDRId1WYR2kdjEgxeIaFbnPYnb1+ga5x2VLbfLSFo9I="));
        System.out.println(encryptor.decrypt("izAG1+cyo85h+sBRdUweC1m3awPpz07Y"));
        System.out.println(encryptor.decrypt("UnYaGMQjAq6YOvrt1mo9OVShAHFrtqzm"));
        /*
ENC(LDVQjFq+62p+2CDlaAJ4VzlwHw2ZvSDh7BDR6RSyhSU=)
ENC(L9+jo18Y3qfz66GFk1vcfA6z6MH9Ul3ni//8+CiaPRuRrYbEQYcoLlfmtXCqFj3Ineu6qAJbOI4cmkjVDUg/Fvqz8QhMRBqKkDRId1WYR2kdjEgxeIaFbnPYnb1+ga5x2VLbfLSFo9I=)
ENC(izAG1+cyo85h+sBRdUweC1m3awPpz07Y)
ENC(UnYaGMQjAq6YOvrt1mo9OVShAHFrtqzm)
         */
        
        return encryptor;
	}
}
