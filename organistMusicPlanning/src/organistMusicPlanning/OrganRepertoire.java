package organistMusicPlanning;

public class OrganRepertoire
	{
		private String liturgical;
		// Ordinary Time, Lent, Advent, Holy Week, Christmas, Easter, Year-Round, Patriotic
		private double minutesAndSeconds;
		// 1.30, 2.45, 3, 4, 5
		private String solo;
		// Prelude, Communion, Postlude, PreludeAndPostlude, PreludeAndCommunion
		private String book;
		// First Organ Book, Ultimate Organ Book, 8 Little Preludes and Fugues
		private String composer;
		// Bach, Gordon Young, Vierne, Buxtehude, Pachelbel
		private String mood;
		// Happy, Sad, Solemn, Joyful, Neutral, Bright, Reflective
		
		public OrganRepertoire (String l, String s, int mas, String m, String c, String b)
		{
			liturgical = l;
			solo = s;
			minutesAndSeconds = mas;
			mood = m;
			composer = c;
			book = b;
		}

		public String getLiturgical()
			{
				return liturgical;
			}

		public void setLiturgical(String liturgical)
			{
				this.liturgical = liturgical;
			}

		public double getMinutesAndSeconds()
			{
				return minutesAndSeconds;
			}

		public void setMinutesAndSeconds(double minutesAndSeconds)
			{
				this.minutesAndSeconds = minutesAndSeconds;
			}

		public String getSolo()
			{
				return solo;
			}

		public void setSolo(String solo)
			{
				this.solo = solo;
			}

		public String getBook()
			{
				return book;
			}

		public void setBook(String book)
			{
				this.book = book;
			}

		public String getComposer()
			{
				return composer;
			}

		public void setComposer(String composer)
			{
				this.composer = composer;
			}

		public String getMood()
			{
				return mood;
			}

		public void setMood(String mood)
			{
				this.mood = mood;
			}
		
	}
