package com.example.ceee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> q1 = new ArrayList<String>();
        q1.add("By close and prolonged contact: If you’re closer than two meters to a person who has the illness. By droplet infection: If one person sneezes or coughs next to you. Via your hands: Infectious droplets can get onto your hands from coughing and sneezing, or from a surface contaminated with the virus, although not all surface are confirmed to be contaminated. Better be safe than sorry.");
        List<String> q2 = new ArrayList<String>();
        q2.add("The incubation period – i.e. the time between infection and the appearance of the first symptoms – is of around 5 days and can last to up to 14 days.");
        List<String> q3 = new ArrayList<String>();
        q3.add("Anyone contracting the new coronavirus is infectious for a long time. Namely:\n	A day before symptoms appear, so before you even notice that you’ve contracted the disease;.\n	While you are experiencing symptoms of the illness. That is when you are most infectious.\n	Until at least 48 hours after you have recovered.");
        List<String> q4 = new ArrayList<String>();
        q4.add("No. It’s not enough to protect yourself since any contact you would do with your face might infect you.");
        List<String> q5 = new ArrayList<String>();
        q5.add("No, it is transmitted from droplets coming from one person sneezing or coughing next to you ");
        List<String> q6 = new ArrayList<String>();
        q6.add("There is no proof that corona virus is transmitted through banknotes, but it can stay on surfaces so you better be safe and clean your coins. ");
        List<String> q7 = new ArrayList<String>();
        q7.add("Based on available information, pregnant people seem to have the same risk as adults who are not pregnant. However, pregnant people have changes in their bodies that may increase their risk of some infections and severe illness when infected with viruses from the same family as COVID-19. ");
        List<String> q8 = new ArrayList<String>();
        q8.add("It is unlikely during pregnancy, since the virus has not been detected in amniotic fluid, breastmilk, or other maternal samples. ");
        List<String> q9 = new ArrayList<String>();
        q9.add("So far there are no known cases of the new coronavirus being transmitted through food or drinking water. If you want to be quite sure, wash and heat foods properly. ");
        List<String> q10 = new ArrayList<String>();
        q10.add("So far there are no known cases of the new coronavirus being transmitted through food or drinking water. If you want to be quite sure, wash and heat foods properly. ");

        List<String> q11 = new ArrayList<String>();
        q11.add("There are no indications that the coronavirus can be passed on through the blood. The transmission of the virus via donated blood is therefore highly unlikely. ");

        List<String> q12 = new ArrayList<String>();
        q12.add("No it doesn’t. You can catch COVID-19, no matter how sunny or hot the weather is. Countries with hot weather have reported cases of COVID-19. ");

        List<String> q13 = new ArrayList<String>();
        q13.add("Alcohol doesn’t prevent COVID-19, on the contrary it can be dangerous. Frequent or excessive alcohol consumption can increase your risk of health problems. ");

        List<String> q14 = new ArrayList<String>();
        q14.add("There is no reason to believe that cold weather can kill the new coronavirus or other diseases. The normal human body temperature remains around 36.5°C to 37°C, regardless of the external temperature or weather.");

        List<String> q15 = new ArrayList<String>();
        q15.add("To date there has been no information nor evidence to suggest that the new coronavirus could be transmitted by mosquitoes.");

        List<String> q16 = new ArrayList<String>();
        q16.add("No. Hand dryers are not effective in killing the 2019-nCoV. The only way to protect yourself against the new coronavirus is to frequently clean your hands with an alcohol-based hand rub or wash them with soap and water. ");
        List<String> q17 = new ArrayList<String>();
        q17.add("No. UV lamps should not be used to sterilize hands or other areas of skin as UV radiation can cause skin irritation.");

        List<String> q18 = new ArrayList<String>();
        q18.add("There is no evidence that COVID-19 can spread to people from the skin, fur, or hair of pets. However, because animals can sometimes carry other germs that can make people sick, it’s always a good idea to practice healthy habits around pets and other animals, including washing hands before and after interacting with them.");

        List<String> q19 = new ArrayList<String>();
        q19.add("Coronaviruses are thought to be spread most often by respiratory droplets. Although the virus can survive for a short period on some surfaces, it is unlikely to be spread from domestic or international mail, products or packaging. However, it may be possible that people can get COVID-19 by touching a surface or object that has the virus on it and then touching their face.");

        List<String> q20 = new ArrayList<String>();
        q20.add("CDC and partners are investigating to determine if you can get sick with COVID-19 more than once. At this time, we are not sure if you can become re-infected. Until we know more, continue to take steps to protect yourself and others.");


        expandableListDetail.put("How is the new coronavirus transmitted? ", q1);
        expandableListDetail.put("How long is the period between infection and the appearance of symptoms? ", q2);
        expandableListDetail.put("And when do people become contagious?", q3);
        expandableListDetail.put("Does wearing rubber gloves protect from corona virus?", q4);
        expandableListDetail.put("Is Corona transmitted through air?", q5);
        expandableListDetail.put("Is the virus transmitted through coins and money?", q6);
        expandableListDetail.put("Are pregnant women at a higher risk of getting infected?", q7);
        expandableListDetail.put("If a pregnant woman is affected, will there be Mother-to-child transmission during pregnancy?", q8);
        expandableListDetail.put("Can the new coronavirus be transmitted via foodstuffs? ", q9);
        expandableListDetail.put("Is there a higher risk of becoming infected with the new coronavirus if you smoke? ", q10);
        expandableListDetail.put("Can the coronavirus be passed on through the blood? ", q11);
        expandableListDetail.put("Does exposing yourself to the sun or to temperatures higher than 25C degrees prevent the coronavirus disease?", q12);
        expandableListDetail.put("Can drinking alcohol protect you against COVID-19? ", q13);
        expandableListDetail.put("Can cold weather or snow kill the coronavirus?", q14);
        expandableListDetail.put("Can the virus be transmitted from mosquito bites?", q15);
        expandableListDetail.put("Are hand dryers effective in killing the new coronavirus?", q16);
        expandableListDetail.put("Can an ultraviolet disinfection lamp kill the new coronavirus?", q17);
        expandableListDetail.put("Can animals carry the virus that causes COVID-19 on their skin or fur?", q18);
        expandableListDetail.put("Am I at risk for COVID-19 from mail, packages, or products?", q19);
        expandableListDetail.put("If I have recovered from COVID-19, will I be immune to it?", q20);

        return expandableListDetail;
    }
}

