package ufile.sender;


import ufile.UFileClient;
import ufile.UFileRequest;
import ufile.UFileResponse;

public interface Sender {
	public static final String UTF8 = "UTF-8";
	public void makeAuth(UFileClient client, UFileRequest request);
	public UFileResponse send(UFileClient ufileClient, UFileRequest request);
}
