package study05;

public class Song {
	
		private String title;
			
		Song(String t) {
			this.title = t;
				}
			
		String get_title() {
			return title;
		}

	public static void main(String[] args) {
	
		
		Song song = new Song("»ö¾È°æ");
		Song nore = new Song("Next Level");
		
		System.out.println(song.get_title());
		System.out.println(nore.get_title());
			

		}

	}


