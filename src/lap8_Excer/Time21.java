package lap8_Excer;

import lab8.Time2;

public class Time21 {
	private int hour;
	private int minute;
	private int second;

		public Time21() {
			this(0,0,0);
		}
		
		public Time21(int h) {
			this(h,0,0);
		}
		public Time21(int h, int m) {
			this(h,m,0);
		}
		public Time21(int h, int m, int s) {
			setTime(h,m,s);
		}
		
		public Time21(Time21 time) {
			this(time.getHour(),time.getMinute(),time.getSecond());
		}

		/* write header for setTime */
		public void setTime(int h,int m,int s) {
			setHour(h);
			setMinute(m);
			setSecond(s);
		}
		
		public void setHour(int h) {
			hour = ((h >= 0 && h < 24) ? h : 0);
		}
		public void setMinute(int m) {
			minute = ((m >= 0 && m < 60) ? m : 0);
		}
		public void setSecond(int s) {
			second = ((s >= 0 && s < 60) ? s : 0);
		}
 		
		public int getHour() {
			return hour;
		}
		
		public int getMinute() {
			return minute;
		}

		public int getSecond() {
			return second;
		}
		
		public void tick() {
			setSecond( second + 1 );
			if( second == 0) {
				incrementMinute();
			}
		}
		
		public void incrementMinute() {
			setMinute(minute +1);
			if( minute == 0) {
				incrementHour();
			}
		}
		
		public void incrementHour() {
			setHour(hour + 1);
		}
		
		public String toUniversalString() {
			return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
		}
		public String toString() {
			return String.format("%d:%02d:%02d %s", 
					((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
					getMinute(),getSecond(),(getHour() < 12 ? "AM" : "PM"));
		}
		
}
