package com.nt.runners;

import java.io.*;

/*import java.time.LocalDateTime;*/
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.MarriageSeeker;
import com.nt.service.IMatrimonyService;
@Component
public class LOBsTestRunner implements CommandLineRunner {
	
	@Autowired
	private IMatrimonyService service;

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter the person name:"); String name=sc.nextLine();
		 * System.out.println("Enter the Person address:"); String addrs=sc.nextLine();
		 * System.out.println("Enter Person Photo file complete path:"); String
		 * photopath=sc.next().replace("?","");
		 * System.out.println("Enter Person bioData file complete path::"); String
		 * bioDataPath=sc.next().replace("?","");
		 * System.out.println("Is the Person Indian?"); boolean indian=sc.nextBoolean();
		 * 
		 * //Prepare byte[] representing photo file content
		 * 
		 * @SuppressWarnings("resource") InputStream is=new FileInputStream(photopath);
		 * byte[] photoData=new byte[is.available()]; photoData=is.readAllBytes();
		 * //prepare char[] representing biddata file content File file=new
		 * File(bioDataPath);
		 * 
		 * @SuppressWarnings("resource") Reader reader=new FileReader(file); char
		 * bioDataContent[]=new char[(int) file.length()]; reader.read(bioDataContent);
		 * 
		 * //prepare Entity class obj MarriageSeeker seeker=new
		 * MarriageSeeker(name,addrs,photoData,LocalDateTime.of(1990,
		 * 11,23,12,45),bioDataContent,indian);
		 * System.out.println(service.registerMarriageSeeker(seeker));
		 */
		
		System.out.println("==============================");
		Optional<MarriageSeeker>opt=service.searchSeekerById(4L);
		if(opt.isPresent()) {
			MarriageSeeker seeker=opt.get();
			System.out.println(seeker.getId()+" "+seeker.getName()+"  "+seeker.getAddrs()+"  "+seeker.isIndian());
			OutputStream os=new FileOutputStream("D:\\seek.jpeg");
			os.write(seeker.getPhoto());
			os.flush();
			Writer writer=new FileWriter("D:\\html.txt");
			writer.write(seeker.getBioData());
			writer.flush();
			os.close();
			writer.close();
			System.out.println("LOBs are retrieved");
			
		}else {
			System.out.println("Records are not found..");
		}
	}

}
