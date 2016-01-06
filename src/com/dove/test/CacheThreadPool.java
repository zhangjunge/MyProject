package com.dove.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class User {
	int userId;
	String username;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User(int userId, String username) {
		super();
		this.userId = userId;
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + "]";
	}
	
	

}

public class CacheThreadPool {
	public static void main(String[] args) {
		int i = 0;
		ExecutorService exec = Executors.newCachedThreadPool();
		for (i = 0; i < 5; i++) {
			Future<User> future = exec.submit(new Callable<User>() {
				@Override
				public User call() throws Exception {
					System.out.println("before sleep");
					User user = new User(1, "zjg");
					Thread.sleep(400);
					System.out.println("after sleep");
					return user;
				}
			});
			try {
				future.get(500, TimeUnit.MILLISECONDS);
				System.out.println(future.get().toString());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block 
				//localtodp
				//todo server
				//todo goithub
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				System.out.println("timeout\n");
				e.printStackTrace();
			}
		}
	}
}