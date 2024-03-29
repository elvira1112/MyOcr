package com.example.myocr;

import java.util.ArrayList;

public class Basic {
	private ArrayList<String> explains = new ArrayList<String>();
	private String phonetic;

	public ArrayList<String> getExplains() {
		return explains;
	}

	public void setExplains(ArrayList<String> explains) {
		this.explains = explains;
	}

	public String getPhonetic() {
		return phonetic;
	}

	public void setPhonetic(String phonetic) {
		this.phonetic = phonetic;
	}

	@Override
	public String toString() {
		return "Basic [explains=" + explains + ", phonetic=" + phonetic + "]";
	}

}
