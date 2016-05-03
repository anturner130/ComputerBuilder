package comp640.computerbuilder.dummy;

import java.util.ArrayList;
import java.util.List;

import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;

/**
 * Created by deandubois on 5/1/16.
 */
public class DummyOperatingSystem implements IDummyParts {
    private List<Part> operatingSystem;

    public DummyOperatingSystem()
    {
        operatingSystem = new ArrayList<>();

        operatingSystem.add(new Part(99, "Windows 10 Home - 64-bit - OEM", BuildStore.Newegg, "The Windows you know, only better\n" +
                "Windows 10 feels familiar so you can get more done from the get-go. The Start menu is back with space to pin your favorite apps. And \n" +
                "simple navigation means you don't need to spend much time learning anything new. Always up-to-date\n" +
                "You won't have to wonder if you have the latest features or security updates. Windows automatically delivers updates, when they're ready, \n" +
                "directly to your device. Cortana's got your back\n" +
                "Cortana is your truly personal digital assistant who works across all your devices to help get things done. Rule the web\n" +
                "Microsoft Edge is an all-new browser built to deliver a better web experience. You can write directly on webpages from your PC, read \n" +
                "articles distraction?free, and save your favorites to read offline later. Take your gaming further\n" +
                "With Xbox on Windows, play and connect with your games and friends. Everywhere. Universal Apps, including Office\n" +
                "The Store in Windows 10 is a one-stop shop for hundreds of thousands of apps including games, music, videos, as well as a new version of \n" +
                "Office.", "Microsoft", PartType.Operating_System,
                "http://images10.newegg.com/ProductImage/32-416-892-09.jpg"));
        operatingSystem.add(new Part(139, "Windows 7 Professional SP1 64-bit - OEM", BuildStore.Amazon, "The Windows you know, only better\n" +
                "Windows 10 feels familiar so you can get more done from the get-go. The Start menu is back with space to pin your favorite apps. And \n" +
                "simple navigation means you don't need to spend much time learning anything new. Always up-to-date\n" +
                "You won't have to wonder if you have the latest features or security updates. Windows automatically delivers updates, when they're ready, \n" +
                "directly to your device. Cortana's got your back\n" +
                "Cortana is your truly personal digital assistant who works across all your devices to help get things done. Rule the web\n" +
                "Microsoft Edge is an all-new browser built to deliver a better web experience. You can write directly on webpages from your PC, read \n" +
                "articles distraction?free, and save your favorites to read offline later. Take your gaming further\n" +
                "With Xbox on Windows, play and connect with your games and friends. Everywhere. Universal Apps, including Office\n" +
                "The Store in Windows 10 is a one-stop shop for hundreds of thousands of apps including games, music, videos, as well as a new version of \n" +
                "Office.", "Microsoft", PartType.Operating_System,
                "http://images10.newegg.com/ProductImage/32-416-892-09.jpg"));
        operatingSystem.add(new Part(99, "Windows 8.1 64-bit - OEM", BuildStore.Newegg, "Windows 8.1 has new ways for you to personalize your PC, and includes \n" +
                "a wave of awesome new apps and services. Work the way youíre used to, and do more at once with more apps. Bing smart search gives you results from your PC, \n" +
                "your apps, and the web. Results are in a clean, graphic view, so you can go where you want right from the search results. Open the Windows Store right from your \n" +
                "Start screen to browse and download apps for cooking, photos, sports, news, and more. Great for work and play, Windows 8 tablets and PCs are powerful, stylish, \n" +
                "and built to go where you go. Get a Windows 8 tablet or PC now, and you can update to Windows 8.1 for free!", "Microsoft", PartType.Operating_System,
                "http://images10.newegg.com/ProductImage/32-416-776-19.jpg"));



    }

    public List<Part> getParts() {return operatingSystem;}
}
