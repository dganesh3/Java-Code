package com.oops.Abstract;

interface PhotoEdit
{
	void resize();
	void crop();
	void addfilters();
}
interface Post
{
	void like();
	void comment();
	void share();
}
interface VideoEdit
{
	void trim();
	void addaudio();
	void changespeed();
}
class Photo implements PhotoEdit,Post
{
	double size;
	int reso;
	String type;
	public void collage()
	{

	}
	@Override
	public void like() 
	{
		System.out.println("like ur photo");

	}
	@Override
	public void comment()
	{

		System.out.println("comment ur photo");
	}
	@Override
	public void share() 
	{
		System.out.println("share ur photo");

	}
	@Override
	public void resize()
	{
		System.out.println("resize ur photo");
	}
	@Override
	public void crop() 
	{
		System.out.println("crop ur photo");
	}
	@Override
	public void addfilters() 
	{
		System.out.println("addfilters ur photo");
	}

}
class Video implements VideoEdit,Post
{
	double size;
	int duration;
	String quality;
	public void minute()
	{
		System.out.println("duration of video");
	}
	@Override
	public void like() 
	{
		System.out.println("like ur video");

	}
	@Override
	public void comment() 
	{
		System.out.println("comment ur video");

	}
	@Override
	public void share()
	{
		System.out.println("share ur video");
	}
	@Override
	public void trim() 
	{
		System.out.println("trim ur video");

	}
	@Override
	public void addaudio()
	{
		System.out.println("addaudio ur video");

	}
	@Override
	public void changespeed() 
	{
		System.out.println("changespeed of ur video");
	}

}
public class Instamain 
{
	public static void main(String[] args)
	{
		Photo p1=new Photo();
		p1.resize();
		p1.crop();
		p1.addfilters();
		p1.like();
		p1.comment();
		p1.share();
		p1.collage();
		/* Video v1=new Video();
	v1.minute();
	v1.like();
	v1.comment();
	v1.share();
	v1.trim();
	v1.addaudio();
	v1.changespeed();*/
	}
}
