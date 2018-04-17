import javax.sound.midi.*;

public class MusicTest1{
	public void play(){
		Swquencer sequencer = MidiSystem.getSequencer(); //将MIDI信息组合成乐曲
		System.out.println("We got a sequencer");
	}//关闭播放
	
	public	static void main(String[] args){
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}
}