package mlopez.awsupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3() {
        /*AWSCredentials awsCredentials = new BasicAWSCredentials(
                "",
                ""
        );*/

        AWSCredentials awsCredentials = new ProfileCredentialsProvider().getCredentials();

        return AmazonS3ClientBuilder
                .standard()
                .withRegion(Regions.US_EAST_1)
                //.withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }

}
