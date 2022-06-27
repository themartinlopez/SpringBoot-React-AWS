package mlopez.awsupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("mlopezstorage");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
