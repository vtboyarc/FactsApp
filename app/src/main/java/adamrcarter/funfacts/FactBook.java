package adamrcarter.funfacts;

import java.util.Random;

/**
 * Created by adamcarter on 12/3/14.
 */
public class FactBook {

    public String[] mFacts = {

            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "Ants communicate with chemicals and can speak many phrases including to take cover from danger.",
            "New research suggests that dolphins are second only to humans in intelligence.",
            "Federal law once allowed the government to quarantine people who came in contact with aliens.",
            "Less than 7 out of every 100 people in the world have a college degree.",
            "The treaty of friendship between North Korea and China doesn't expire until 2021.",
            "Everyday, tens of thousands of Indian child-slaves mine mica – The little sparkles in women's makeup.",
            "The reason eyewitness testimonies can differ is because each person has other memories that can alter their view of the event in question.",
            "The Great Depression was so bad that Cameroon, a West African nation, sent New York $3.77 in hunger relief.",
            "\"The Dark Knight\" was the first Batman film with no live-action or CGI bats.",
            "Suicide is the leading cause of death among California gun purchasers.",
            "Fast food chain Arby's bought Pharrell Williams' hat from the 2014 Grammy Awards for $44,100.",
            "90% of U.S. dollar bills are contaminated with cocaine, according to studies.",
            "Mars is red because its surface is covered in iron oxide, which is the chemical that makes blood and rust look red.",
            "One slice of Godiva Chocolate Cheesecake from the Cheesecake Factory has 1,110 calories.",
            "The Lamborghini that Bruce Wayne drives in \"The Dark Knight\" is called the Murciélago, which is Spanish for bat.",
            "Nicolas Cage once bought a pet octopus because he thought it would make him a better actor.",
            "A woman once set her duplex on fire to kill a spider.",
            "A 5-minute shower in North America uses more water than is available in an entire day to a person living in the slum of a developing nation.",
            "People participate in Black Friday due to a misconception that there is a scarcity of items and deals.",
            "A relaxed state of mind and an influx of dopamine makes people more creative, which is why many people have good ideas in the shower.",
            "If the Earth was smooth, the ocean would cover the entire surface to a depth of 12,000 feet.",
            "Jay-Z has the second highest amount of number one albums of all time. The Beatles have the most.",
            "Only 5% of Twitter users have more than 100 followers.",
            "America has the highest number of serial killers in the world.",
            "The peak relationship breakup times are two weeks before Christmas and the beginning of March.",
            "It is estimated that in 1,000 years, our languages today will be extinct.",
            "The amount needed to feed every child for a year is less than 20% of the annual amount given to charity by the citizens of the USA.",
            "If two people never stop loving each other, one will have to watch the other die.",
            "About a quarter of the world’s hazelnuts (nearly 100,000 tons a year) are used to make Nutella.",
            "Oxford University is older than the Aztec Empire.",
            "Iron Man's computer, J.A.R.V.I.S., is an acronym for \"Just A Rather Very Intelligent System.\"",
            "If you drilled a tunnel through the Earth and jumped in, it would take you about 42-53 minutes to get to the other side.",
            "Jupiter shields Earth from hundreds of asteroids heading towards our planet.",
            "Rubbing a banana peel on a mosquito bite can help stop the itching.",
            "Approximately 49 moons could fit into Earth.",
            "There is gravity in space — if there wasn't, stars and planets wouldn't be able to form.",
            "The U.S. has a greater percentage of its population in jail than any other country in the world.",
            "\"Almost\" is the longest word in the English language with all the letters in alphabetical order.",
            "A study conducted by GE Money states that women spend more than 8 years of their life shopping.",
            "Our brains are wired to prefer music we already know.",
            "In Ancient Greek, the word \"idiot\" was used to describe any person who was not interested in politics.",
            "About 80% of the animals found in Madagascar do not exist anywhere else on Earth.",
            "Every 24 hours, about 8,640,000 lightning bolts touch the earth.",
            "Research has suggested that yoga improves social and occupational functioning in schizophrenic patients.",
            "Americans eat approximately 100 acres of pizza each day, or 350 slices per second.",
            "Putting sugar on a wound or cut will greatly reduce pain and speed up the healing process.",
            "Jupiter weights more than twice as much as all our other planets together.",
            "According to research, the deadliest holidays in the U.S. are 4th of July, Christmas, and New Year's Day.",
            "Playing Tetris soon after a traumatic experience has been proven to help wipe bad memories and prevent flashbacks.",
            "The average American Thanksgiving dinner is 2,536 calories — assuming that you have normal portions and don't go back for seconds.",
            "Dogs actually listen to and mull over human words to decipher what we're saying to them.",
            "Cats can learn how to bark from listening to dogs.",
            "Heading a soccer ball causes mild concussions, and players that head the ball often have low cognitive performance.",
            "There are fewer than 900 mountain gorillas left in the world, due to poaching, habitat loss and disease.",
            "Of the Seven Wonders of the World, 3 fell due to earthquakes, 2 due to fires, 1 probably never existed, and only one stands today.",
            "A man once ordered a TV on Amazon, but got a semi-automatic assault rifle instead.",
            "84% of vegetarians and vegans switch back to eating meat at some point.",
            "Studying for 30-50 minutes, with 10 minute breaks is one of the best methods to improve your retention.",
            "A live flu virus can last up to 17 days on a dollar bill.",
            "The arms of condemned prisoners are swabbed with alcohol prior to lethal injection in order to keep the area sterile.",
            "William Shatner could never spread his fingers for the Vulcan greeting unless the studio crew tied fishing line around his fingers.",
            "NASA estimates that the value of minerals in the asteroid belt exceeds $600,000,000,000,000,000,000.",
            "A microwave uses more electricity to power its clock than it does to heat your food.",
            "Ten years ago, a 1GB SD card was $500.",
            "Earth is the only planet not named after a god.",
            "Armadillos have four babies at the same time, and they are always the same sex.",
            "An octopus will eat its own arms if it gets really hungry.",
            "Dolphins sleep with only half of their brain at a time, and with one eye open.",
            "Russian scientists revived a plant from a fossilized fruit trapped in ice 32,000 years ago, burred by an Artic Squirrel.",
            "90% of the foods we consume come from just 30 plants.",
            "When asked what his IQ was, Stephen Hawking replied “I have no idea. People who boast about their IQ are losers”",
            "Your odds of dying in a car accident are around 1 in 5,000.",
            "Indoor tanning has caused more cases of skin cancer, than smoking has caused cases of lung cancer.",
            "We live about 80 milliseconds in the past because that's how long it takes our brains to process information.",
            "Napping for just 6 minutes can help improve your memory.",
            "Dogs tilt their heads when something piques their interest and they want to hear better.",

    };

    public String getFact() {




    String fact = "";

    // Randomly select a fact
    Random randomGenerator = new Random(); // construct a new random number generator
    int randomNumber = randomGenerator.nextInt(mFacts.length);

    fact = mFacts[randomNumber];

        return fact;
    }
}
