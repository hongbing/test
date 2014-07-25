package com.weibo.protobuf;

import com.google.protobuf.DescriptorProtos.DescriptorProto;
import com.google.protobuf.Descriptors.Descriptor;

public class ProtobufTest {
	
	public static void main(String[] args) {
		Descriptor descriptor = DescriptorProto.getDescriptor();
		String s = descriptor.getFullName();
		System.out.println("type: " + s);
		
		String msg = null; 
		;
		
	}
	

}
