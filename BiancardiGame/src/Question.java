
public class Question {
	private static int point;
	private static String question;
	private static int questionNumber = 1;

	public Question() {
		questionNumber = 1;
		question = "";
	}

	public static String generateQuestion() {
		// get each question
		switch (questionNumber) {
		case 1:
			question = "what's your ideal date?";
			break;
		case 2:
			question = "how high is your gpa?";
			break;
		case 3:
			question = "how many hours do you spend a day programming?";
			break;
		case 4:
			question = "how often do you regularly search the internet for memes?";
			break;
		case 5:
			question = "are you a redhead who likes to run?";
			break;
		case 6:
			question = "how much do you talk?";
			break;
		case 7:
			question = "what's your favorite way to spend a rainy day?";
			break;
		case 8:
			question = "how often do you carry around your calculator?";
			break;
		case 9:
			question = "how often do you make your own memes?";
			break;
		case 10:
			question = "how would you classify your dance moves?";
			break;
		case 11:
			question = "where would you like to live if you could choose your ideal place?";
			break;
		case 12:
			question = "what's your favorite spongebob quote?";
			break;
		case 13:
			question = "what's your spirit animal?";
			break;
		case 14:
			question = "your house is on fire.  what do you grab?";
			break;
		case 15:
			question = "what's your favorite season?";
			break;
		case 16:
			question = "what coding language do you speak best?";
			break;
		case 17:
			question = "how much do you java?";
			break;
		case 18:
			question = "what song best describes your life?";
			break;
		case 19:
			question = "how often do you sing to yourself?";
			break;
		case 20:
			question = "what would be your ideal marriage proposal?";
			break;
		case 21:
			question = "at what age did you move out of your parents' house?";
			break;
		case 22:
			question = "what is your sign?";
			break;
		case 23:
			question = "what is your aura color?";
			break;
		case 24:
			question = "what is your favorite anime?";
			break;
		case 25:
			question = "do you have children? if so, how many?";
			break;
		case 26:
			question = "what do you wish to happen?";
			break;
		case 27:
			question = "if you could do anything before you die, what would it be?";
			break;
		case 28:
			question = "what's your nickname?";
			break;
		case 29:
			question = "if you could have dinner with any three people, who would they be?";
			break;
		case 30:
			question = "what's your favorite book?";
			break;
		case 31:
			question = "what do you do when you're stressed?";
			break;
		case 32:
			question = "what has been your biggest challenge in life?";
			break;
		case 33:
			question = "are you still on zbug?";
			break;
		case 34:
			question = "on a scale of 1 to 10, how much do you like gridworld?";
			break;
		case 35:
			question = "how often do you spontaneously break out into dance?";
			break;
		case 36:
			question = "if you could travel anywhere, where would you go?";
			break;
		case 37:
			question = "who's your messiah?";
			break;
		case 38:
			question = "what do you collect?";
			break;
		case 39:
			question = "what's your favorite meme?";   
			break;
		case 40:
			question = "what's your favorite pokemon?";
			break;
		case 41:
			question = "what's your favorite food?";
			break;
		} // end switch
		questionNumber++; // increment question number for next call
		return question;
	}

	public static int assignSelfPoints(char answer) {
		switch (questionNumber - 1) // sort through question numbers and assign
								// point totals based on answers
		{
		case 1: {
			switch (answer) {
			case 'a': {
				return 2;

			}
			case 'b': {
				return 3;

			}
			case 'c': {
				return 4;

			}
			case 'd': {
				return 1;

			}
			} // end switch
		}
		case 2: {
			switch (answer) {
			case 'a': {
				return 1;

			}
			case 'b': {
				return 2;

			}
			case 'c': {
				return 3;

			}
			case 'd': {
				return 4;

			}
			} // end switch
		}
		case 3: {
			switch (answer) {
			case 'a': {
				return 3;

			}
			case 'b': {
				return 1;

			}
			case 'c': {
				return 2;

			}
			case 'd': {
				return 4;

			}
			} // end switch
		}
		case 4: {
			switch (answer) {
			case 'a': {
				return 1;

			}
			case 'b': {
				return 2;

			}
			case 'c': {
				return 4;

			}
			case 'd': {
				return 3;

			}
			} // end switch
		}
		case 5: {
			switch (answer) {
			case 'a': {
				return 1;

			}
			case 'b': {
				return 3;

			}
			case 'c': {
				return 4;

			}
			case 'd': {
				return 2;

			}
			} // end switch
		}
		case 6: {
			switch (answer) {
			case 'a': {
				return 3;

			}
			case 'b': {
				return 1;

			}
			case 'c': {
				return 2;

			}
			case 'd': {
				return 4;

			}
			} // end switch
		}
		case 7: {
			switch (answer) {
			case 'a': {
				return 3;

			}
			case 'b': {
				return 2;

			}
			case 'c': {
				return 4;

			}
			case 'd': {
				return 1;

			}
			} // end switch
		}
		case 8: {
			switch (answer) {
			case 'a': {
				return 3;

			}
			case 'b': {
				return 4;

			}
			case 'c': {
				return 2;

			}
			case 'd': {
				return 1;

			}
			} // end switch
		}
		case 9: {
			switch (answer) {
			case 'a': {
				return 3;

			}
			case 'b': {
				return 1;

			}
			case 'c': {
				return 4;

			}
			case 'd': {
				return 2;

			}
			} // end switch
		}
		case 10: {
			switch (answer) {
			case 'a': {
				return 3;

			}
			case 'b': {
				return 2;

			}
			case 'c': {
				return 1;

			}
			case 'd': {
				return 4;

			}
			} // end switch
		}
		case 11: {
			switch (answer) {
			case 'a': {
				return 3;

			}
			case 'b': {
				return 1;

			}
			case 'c': {
				return 4;

			}
			case 'd': {
				return 2;

			}
			} // end switch
		}
		case 12: {
			switch (answer) {
			case 'a': {
				return 2;

			}
			case 'b': {
				return 3;

			}
			case 'c': {
				return 4;

			}
			case 'd': {
				return 1;

			}
			} // end switch
		}
		case 13: {
			switch (answer) {
			case 'a': {
				return 1;

			}
			case 'b': {
				return 2;

			}
			case 'c': {
				return 3;

			}
			case 'd': {
				return 4;

			}
			} // end switch
		}
		case 14: {
			switch (answer) {
			case 'a': {
				return 1;

			}
			case 'b': {
				return 3;

			}
			case 'c': {
				return 2;

			}
			case 'd': {
				return 4;

			}
			} // end switch
		}
		case 15: {
			switch (answer) {
			case 'a': {
				return 2;

			}
			case 'b': {
				return 1;

			}
			case 'c': {
				return 3;

			}
			case 'd': {
				return 4;

			}
			} // end switch
		}
		case 16: {
			switch (answer) {
			case 'a': {
				return 4;

			}
			case 'b': {
				return 2;

			}
			case 'c': {
				return 3;

			}
			case 'd': {
				return 1;

			}
			} // end switch
		}
		case 17: {
			switch (answer) {
			case 'a': {
				return 4;

			}
			case 'b': {
				return 1;

			}
			case 'c': {
				return 2;

			}
			case 'd': {
				return 3;

			}
			} // end switch
		}
		case 18: {
			switch (answer) {
			case 'a': {
				return 3;

			}
			case 'b': {
				return 4;

			}
			case 'c': {
				return 2;

			}
			case 'd': {
				return 1;

			}
			} // end switch
		}
		case 19: {
			switch (answer) {
			case 'a': {
				return 2;

			}
			case 'b': {
				return 4;

			}
			case 'c': {
				return 1;

			}
			case 'd': {
				return 3;

			}
			} // end switch
		}
		case 20: {
			switch (answer) {
			case 'a': {
				return 2;

			}
			case 'b': {
				return 3;

			}
			case 'c': {
				return 1;

			}
			case 'd': {
				return 4;

			}
			} // end switch
		}
		case 21: {
			switch (answer) {
			case 'a': {
				return 2;

			}
			case 'b': {
				return 3;

			}
			case 'c': {
				return 1;

			}
			case 'd': {
				return 4;

			}
			} // end switch
		}
		case 22: {
			switch (answer) {
			case 'a': {
				return 2;

			}
			case 'b': {
				return 3;

			}
			case 'c': {
				return 4;

			}
			case 'd': {
				return 1;

			}
			} // end switch
		}
		case 23: {
			switch (answer) {
			case 'a': {
				return 3;

			}
			case 'b': {
				return 2;

			}
			case 'c': {
				return 1;

			}
			case 'd': {
				return 4;

			}
			} // end switch
		}
		case 24: {
			switch (answer) {
			case 'a': {
				return 2;

			}
			case 'b': {
				return 3;

			}
			case 'c': {
				return 4;

			}
			case 'd': {
				return 1;
			}
			} // end switch
		}
		case 25: {
			switch (answer) {
			case 'a': {
				return 4;

			}
			case 'b': {
				return 1;

			}
			case 'c': {
				return 2;

			}
			case 'd': {
				return 3;

			}
			} // end switch
		}
		case 26: {
			switch (answer) {
			case 'a': {
				return 2;

			}
			case 'b': {
				return 3;

			}
			case 'c': {
				return 1;

			}
			case 'd': {
				return 4;

			}
			} // end switch
		}
		case 27: {
			switch (answer) {
			case 'a': {
				return 4;

			}
			case 'b': {
				return 2;

			}
			case 'c': {
				return 1;

			}
			case 'd': {
				return 3;

			}
			} // end switch
		}
		case 28: {
			switch (answer) {
			case 'a': {
				return 4;

			}
			case 'b': {
				return 2;

			}
			case 'c': {
				return 1;

			}
			case 'd': {
				return 3;

			}
			} // end switch
		}
		case 29: {
			switch (answer) {
			case 'a': {
				return 1;

			}
			case 'b': {
				return 3;

			}
			case 'c': {
				return 4;

			}
			case 'd': {
				return 2;

			}
			} // end switch
		}
		case 30: {
			switch (answer) {
			case 'a': {
				return 4;

			}
			case 'b': {
				return 2;

			}
			case 'c': {
				return 3;

			}
			case 'd': {
				return 1;

			}
			} // end switch
		}
		case 31: {
			switch (answer) {
			case 'a': {
				return 3;

			}
			case 'b': {
				return 4;

			}
			case 'c': {
				return 2;

			}
			case 'd': {
				return 1;

			}
			} // end switch
		}
		case 32: {
			switch (answer) {
			case 'a': {
				return 4;

			}
			case 'b': {
				return 3;

			}
			case 'c': {
				return 1;

			}
			case 'd': {
				return 2;

			}
			} // end switch
		}
		case 33: {						//start here boi
			switch (answer) {
			case 'a': {
				return 1;

			}
			case 'b': {
				return 3;

			}
			case 'c': {
				return 2;

			}
			case 'd': {
				return 4;

			}
			} // end switch
		}
		case 34: {
			switch (answer) {
			case 'a': {
				return 1;

			}
			case 'b': {
				return 2;

			}
			case 'c': {
				return 3;

			}
			case 'd': {
				return 4;

			}
			} // end switch
		}
		case 35: {
			switch (answer) {
			case 'a': {
				return 4;

			}
			case 'b': {
				return 1;

			}
			case 'c': {
				return 3;

			}
			case 'd': {
				return 2;

			}
			} // end switch
		}
		case 36: {
			switch (answer) {
			case 'a': {
				return 2;

			}
			case 'b': {
				return 1;

			}
			case 'c': {
				return 3;

			}
			case 'd': {
				return 4;

			}
			} // end switch
		}
		case 37: {
			switch (answer) {
			case 'a': {
				return 2;

			}
			case 'b': {
				return 4;

			}
			case 'c': {
				return 2;

			}
			case 'd': {
				return 3;

			}
			} // end switch
		}
		case 38: {
			switch (answer) {
			case 'a': {
				return 4;

			}
			case 'b': {
				return 2;

			}
			case 'c': {
				return 2;

			}
			case 'd': {
				return 1;

			}
			} // end switch
		}
		case 39: {
			switch (answer) {
			case 'a': {
				return 1;

			}
			case 'b': {
				return 4;

			}
			case 'c': {
				return 2;

			}
			case 'd': {
				return 3;

			}
			} // end switch
		}
		case 40: {
			switch (answer) {
			case 'a': {
				return 2;

			}
			case 'b': {
				return 4;

			}
			case 'c': {
				return 3;

			}
			case 'd': {
				return 1;

			}
			} // end switch
		}
		case 41: {
			switch (answer) {
			case 'a': {
				return 2;

			}
			case 'b': {
				return 3;

			}
			case 'c': {
				return 4;

			}
			case 'd': {
				return 1;
			}
			} // end switch
		}
		} // end switch
		return point;
	}

	public static int assignNPCPoints() {
		return (int) (Math.random() * 4 + 1);
	}

	public static int getQuestionNumber() {
		return questionNumber;
	}
}

