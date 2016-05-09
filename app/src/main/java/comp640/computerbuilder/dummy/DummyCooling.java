package comp640.computerbuilder.dummy;

import java.util.ArrayList;
import java.util.List;

import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;

/**
 * Created by deandubois on 5/1/16.
 */
public class DummyCooling implements IDummyParts {
    private List<Part> cooling;

    public DummyCooling()
    {
        cooling = new ArrayList<>();

        cooling.add(new Part(100, "Hydro Seriesô H100i GTX Extreme Performance Water / Liquid CPU Cooler. 240mm", BuildStore.Newegg, "The Hydro Series H100i GTX is an extreme performance, all-in-one liquid CPU cooler for cases with 240mm radiator mounts. The 240mm radiator and dual SP120L PWM fans provide the excellent heat dissipation you need for highly overclocked CPUs. Corsair Link is built in, so you can monitor temperatures, adjust cooling performance and customize LED lighting directly from your desktop.", "Corsair", PartType.Cooling,
                "http://images17.newegg.com/is/image/newegg/35-181-090-Z01?$S640$"));
        cooling.add(new Part(75, "Hyper 212 EVO - CPU Cooler with 120 mm PWM Fan", BuildStore.Newegg, "Unmatched performance for the value, these are the tenants that guided Cooler Master engineers when designing the Hyper 212 EVO. Patented Continuous Direct Contact (CDC) technology ensures that the heat pipes are free of barriers while drawing heat away from the processor. A PWM fan ensures that fan speed can be intelligently controlled to ensure that it only speeds up when more cooling is necessary.", "Cooler Master", PartType.Cooling,
                "http://images10.newegg.com/productimage/35-103-099-08.jpg"));
        cooling.add(new Part(99, "Gamer Storm CAPTAIN 360 CPU Liquid Cooler AIO Water Cooling Ceramic Bearing Pump Visual Liquid Flow with 3 x 120mm FDB PWM Fan Rubber Coating Deep Silent Support LGA 2011-v3", BuildStore.Newegg, "The Captain Series is the innovative, high quality, CPU liquid cooler design from Gamer Storm, DEEPCOOL. Innovated by DEEPCOOL's Steam Castle Design, the Captain has a Steam Punk-style appearance, built with visible liquid flow and LED lighting. You'll be overjoyed not only because of your CPU cooling but also the aesthetics. The Captain Series with its side window is sure to be your ultimate choice for a computer case.", "Deep Cool", PartType.Cooling,
                "http://images17.newegg.com/is/image/newegg/35-856-025-Z01?$S640$"));
        cooling.add(new Part(120, "NH-D15 SSO2 D-Type Premium CPU Cooler, NF-A15 x 2 PWM Fans", BuildStore.Newegg, "Succeeding the award-winning NH-D14 cooler, the Noctua NH-D15 sets a new standard in high-end CPU coolers, with sophisticated design and superb quality components. This flagship CPU cooler adopts powerful dual tower architecture, and two premium-grade NF-A15 140mm fans with PWM support for automatic speed control. The heatsink fin stack is wider and the heatpipes are spaced further apart than that of the predecessor NH-D14, delivering better efficiency and more uniform dissipation. The included NT-H1 thermal grease is also professional grade with maximum heat conductivity and ease of application. Plus, the SecuFirm2 multi-socket mounting system is compatible with both AMD and Intel platforms, of previous, current and even future generation, making it a solid investment that can live on till your next two or three builds.", "Noctua", PartType.Cooling,
                "http://images17.newegg.com/is/image/newegg/35-608-045-Z01?$S640$"));
        cooling.add(new Part(89, "V8 GTS - High Performance CPU Cooler with Horizontal Vapor Chamber and 8 Heatpipes", BuildStore.Newegg, "The Cooler Master V8 GTS features a powerful car engine look and massive cooling capability. It offers a high-performance horizontal vapor chamber, and a triple-tower design with eight high-performance heatpipes and two high-airflow LED fans. The horizontal vapor chamber spreads heat up to eight times faster than heatpipes, which minimizes CPU hotspots and quickly balances the heat load between all heatpipes.", "Cooler Master", PartType.Cooling,
                "http://images17.newegg.com/is/image/newegg/35-103-189-Z01?$S640$"));
        cooling.add(new Part(253, "GAMMAXX 400 CPU Cooler 4 Heatpipes 120mm PWM Fan with Blue LED", BuildStore.Newegg, "Equipped with multiple clips to support Intel LGA2011/1366/1156/1155/1150/775 and AMD FM2/FM1/AM3+/AM3/AM2+/AM2/K8.\n" +
                "4 sintered powder heatpipes directly touch the CPU surface and conduct heat from the processor quickly to protect it from overheating.\n" +
                "120x120x25mm PWM fan offers optimal airflow.\n" +
                "Semi-transparent fan with blue LED, modding looking.\n" +
                "Extra fan clips provided allow to add a second fan to form a push-pull config.\n" +
                "Easy installation without moving the motherboard.", "Deep Cool", PartType.Cooling,
                "http://images10.newegg.com/NeweggImage/productimage/35-856-005-07.jpg"));
        cooling.add(new Part(95, "Hydro Seriesô H110i GTX 280mm Extreme Performance Liquid CPU Cooler", BuildStore.Newegg, "The Hydro Series H110i GTX is an extreme performance, factory sealed, all-in-one liquid CPU cooler for cases with 280mm radiator mounts. The 280mm radiator and dual SP140L PWM fans provide the excellent cooling you need for highly overclocked CPUs. Corsair Link software control is built in, so you can monitor temperatures, adjust cooling performance and customize LED lighting directly from your desktop.", "Corsair", PartType.Cooling,
                "http://images10.newegg.com/productimage/35-181-094-07.jpg"));
        cooling.add(new Part(223, "Gamer Storm CAPTAIN 120 CPU Liquid Cooler AIO Water Cooling Ceramic Bearing Pump Visual Liquid Flow with 120mm FDB PWM Fan Rubber Coating Deep Silent Support LGA 2011-v3", BuildStore.Newegg, "The Captain Series is the innovative, high quality CPU liquid cooler design from Gamer Storm, DEEPCOOL. Innovated by DEEPCOOL's Steam Castle Design, the Captain has a Steam Punk style, built with visible liquid flow and LED lighting. You'll be overjoyed not only because of your CPU cooling but also the aesthetics. The Captain Series with its side window is sure to be your ultimate choice for a computer case.", "Deep Cool", PartType.Cooling,
                "http://images10.newegg.com/productimage/35-856-023-16.jpg"));
        cooling.add(new Part(24, "Hyper T4 - CPU Cooler with 4 Direct Contact Heatpipes", BuildStore.Newegg, "Equipped with four direct contact heatpipes and a 120mm wide-range PWM fan, the CoolerMaster Hyper T4 provides a great balance of performance and noise levels. This CPU cooler is also a great match for any system, thanks to the quick and easy snap-on fan bracket and a universal mounting system. ", "Cooler Master", PartType.Cooling,
                "http://images17.newegg.com/is/image/newegg/35-103-182-Z01?$S640$"));
        cooling.add(new Part(12, "ROCF-11003 - 140mm Computer Case Cooling Fan - Hydro Dynamic Bearing, Silent, 2 Rotation Speeds with PWM Control", BuildStore.Newegg, "The Rosewill ROCF-11003 is built to perform with a super silent 14cm fan which uses S-FLOW blades supplying 30% more airflow than a standard fan at the same speed. The greater performance combined with PWM automatic speed control allows the fan noise to be kept to a minimum.", "Rosewill", PartType.Cooling,
                "http://images17.newegg.com/is/image/newegg/35-200-067-Z01?$S640$"));
        cooling.add(new Part(56, "Hydro Series High Performance Liquid CPU Cooler H60", BuildStore.Amazon, "Upgrade from your stock CPU fan or bulky air cooler to the efficiency and simplicity of liquid CPU cooling. Enjoy better cooling performance and lower noise, and protect your investment in your CPU. The included SP120L fan uses custom-engineered impellers for better static pressure to noise ratio, offering improved performance at lower noise levels. \n" +
                "Customer Service / Tech support: 1-888-222-4346 opt. 1", "Corsair", PartType.Cooling,
                "http://ecx.images-amazon.com/images/I/51XDyt051LL._SL1000_.jpg"));
        cooling.add(new Part(98, "Cyclone Blower, Expansion Slot Cooling Fan", BuildStore.Amazon, "Antec's Cyclone Blower slot-mounted cooling fan measures just 89 x 21 x 111 mm (W x H x D) to ensure a comfortable fit in any expansion slot. The high-power (2,200 rpm/22 CFM), low-noise (28 dBA) fan is optimized for keeping your video and other expansion cards happy and cool inside your CPU.", "Antec", PartType.Cooling,
                "http://ecx.images-amazon.com/images/I/411K8B5CK6L.jpg"));
        cooling.add(new Part(73, "SP-FC70-BL Spectrum System Fan Card with Dual Adjustable 70mm UV LED Fans (Blue)", BuildStore.Amazon, "With the speed at which computer components now run, there is a tremendous amount of heat generated inside a PC.  While case fans help cool the system, they generally only provide horizontal airflow.  With that in mind, Vantec introduces the Spectrum Fan Card.  Utilizing any available PCI slot, the Spectrum Fan Card serves a dual purpose of directly cooling any PCI/AGP cards surrounding it as well as providing better air circulation with two adjustable fans.  Made from UV sensitive material and featuring built-in UV LED lights, the Vantec Spectrum Fan Card lights up your case while cooling it down.", "Vantece", PartType.Cooling,
                "http://ecx.images-amazon.com/images/I/41tiflta9cL.jpgg"));
        cooling.add(new Part(112, "Freezer 13 CO - 200 Watt Multicompatible Low Noise CPU Cooler with Extreme High Durability for AMD and Intel Sockets - Ideal for Systems running 24/7", BuildStore.Amazon, "Superior Cooling Perfomance A 92 mm PWM fan in combination with double-sided 6 mm copper heatpipes and a 45-fin heatsink enable the Freezer 13 CO to deliver high performance and improve heat transfer from the CPU. It excels in cooling efficiency in a Hexus comparison review with the stock cooler as well as competitors. Cooling Performance on Intel Core i7-3770K (Full Load) Freezer 13 CO >>>>>>> 41.9 ∞C Noctua NH-U9B SE2 >>>>>>>> 42.5∞C Thermaltake Contac 39 >>>>>>>> 42,8∞C Boxed Cooler >>>>>>>>>>>>>> 61.2∞C Delta temperature, stock clocked, 3.5GHz, 1.17V; Tested with Prime95 small FFT. Data Source: Hexus Low Noise Freezer 13 CO is one of the quietest coolers in the market, according to a test by Hexus. Thanks to the PWM control, the fan speed adjusts according to the CPU temperature and thus the noise level remains at an absolute minimum which qualifies it as a silent cooler. Noise Level on Intel Core i7-3770K (Full Load) Freezer 13 CO >>>>>>>>>> 41.4dBA Noctua NH-U9B SE2 >>>>>>>>>>> 43.6dBA Thermaltake Contac 39 >>>>>>>>>>>>>> 49.7dBA Tested with PCE-318 sound meter. Data Source: Hexus Multi-Compatibility Freezer 13 CO features wide compatibility with AMD and Intel sockets. Its simple mounting system is designed to fit all current CPU platforms. It is compatible with AMD Sockets FM2, FM1, AM3+, AM3, AM2+, AM2, 939 and 754 ; Intel Sockets 1366, 1156, 1155, 1150 and 775 . Easy Installation The unique push-pin mounting system offers a hassle-free installation in minutes and excellent stability. Its fibre reinforced retention module is strong enough to make PCs with this cooler transportation proof. The pre-applied ARCTIC MX-4 high performance thermal compound shortens installation time further.", "Arctic", PartType.Cooling,
                "http://ecx.images-amazon.com/images/I/81MBspxXTeL._SL1500_.jpg"));
        cooling.add(new Part(8, "80mm Cooling Fan FD08025S1M3/4", BuildStore.Amazon, "MASSCOOL FD08025S1M3/4 80mm Cooling Fan", "Mass Cool", PartType.Cooling,
                "http://ecx.images-amazon.com/images/I/41UUWEJj8lL.jpg"));
        cooling.add(new Part(128, "DIY Best Water Cooling Kit for Cpu Water Block 120p Radiato Water Tank Etc", BuildStore.Amazon, "When looking for a complete solution that meets the needs of water cooling enthusiasts,the The Nhowe 120 DIY Water Cooling Kit is now here. As a Limited-edition LCS combo kit, Nhowe provides everything needed to add exceptional performance to your CPU with a DIY style all together. Gain freedom to display and secure your cooling components in endless configurations for a one of a kind presentation. Take your cooling to the next level with the Nhowe 120 DIY Water Cooling Kit\n" +
                "100% new, fine workmanship, simple sense is very strong!\n" +
                "CPU water cooling block X1\n" +
                "SC600 water pump+140 mm cylindrical tank X1\n" +
                "120P Water cooling Radiator X1\n" +
                "120MM Cooling fan X1\n" +
                "Fan guard X 2\n" +
                "3/8 ID,1/2OD pipe X 3M\n" +
                "Install the screw X 1\n" +
                "we shiped by usps ,need 7-15 working days could be recived it ,thanks and have a good day", "Nhowe", PartType.Cooling,
                "http://ecx.images-amazon.com/images/I/51PwqNkCH4L.jpg"));
        cooling.add(new Part(47, "Dual 80mm USB Cooling Fans", BuildStore.Amazon, "To use these fans you will need access to a USB port, the fan will switch on when the device is powered. \n" +
                "It's been tested and will work with popular devices like Cable & Satellite Boxes as well as most common game consoles like the Nintendo Wii, Xbox 360, and Playstation 3.\n" +
                "Also it's a great addition to a closed computer cabinet so you can exhaust the hot air that is created by the computer whenever it is powered on.\n" +
                "\n" +
                "They come with rubber feet to stick on the bottom of fans to prevent scratches and movement when placed on top of a device and a wire grill to keep fingers and any stray wires from getting into the fan blades. \n" +
                "\n" +
                "Includes:\n" +
                "(2) 80x80x25mm fans powered from 1 USB plug\n" +
                "(8) rubber stick-on feet\n" +
                "(1) Black wire finger grill\n" +
                "\n" +
                "Fan Specifications:\n" +
                "Dimensions: 80x80x25mm\n" +
                "Rated Voltage: 5 Volts\n" +
                "Connector: USB\n" +
                "Tail: 16 inch /Dual \n" +
                "RPM: 1550 +/- 10%\n" +
                "CFM: 20\n" +
                "dB: 17 \n" +
                "Bearing: Dual Ball Bearing\n" +
                "MTFB:50,000 hrs", "Coolerguys", PartType.Cooling,
                "http://ecx.images-amazon.com/images/I/510YgKvQiKL.jpg"));
        cooling.add(new Part(89, " MassAir Maker 8 Cooling Fan MAZ-T8PN-418PR-R1", BuildStore.Amazon, "The MasterAir Maker 8 has landed. It's designed for gamers and over clockers who demand ultra-low temperatures, aggressive LED lighting, and total control over their hardware. A seriously size able unit bursting at the seams with our newly patented 3D Vapor Chamber technology, your system will look amazing and stay rock solid even during intense gaming and overclocking. And yes, you can customize the outlook with two bundled top cover designs, as well as adjust the fan size, model or position for memory or graphics card clearance.", "Cooler Master", PartType.Cooling,
                "http://ecx.images-amazon.com/images/I/71r6oPzNRtL._SL1000_.jpg"));
        cooling.add(new Part(5, "92mm x 25mm DC 12V 2 Terminal 65.01CFM Computer Case CPU Cooling Fan", BuildStore.Amazon, "2 Terminal IDE Power Connector cooling fan for computer case, CPU Cooler, other radiator, etc.", "uxcell", PartType.Cooling,
                "http://ecx.images-amazon.com/images/I/61K2vJycJhL._SL1100_.jpg"));
        cooling.add(new Part(23, "MULTIFAN S3, Quiet 120mm USB Fan for Receiver DVR Playstation Xbox Computer Cabinet Cooling", BuildStore.Amazon, "The ultra-quiet cooling fan can be positioned to stand upright or laid flat to cool various electronics and components. Features a multi-speed controller with power switch. Includes eight large anti-vibration rubber feet and a 6-foot power cord. The USB plug can be plugged into the USB ports found behind popular electronics such as receivers and video game consoles. Each unit contains an additional USB port, up to four fans can be daisy chained together to share the same power source. Certified by CE, UL, TUV, and RoHS.", "AC Infinity", PartType.Cooling,
                "http://ecx.images-amazon.com/images/I/61YhqqovKjL._SL1000_.jpg"));

    }

    public List<Part> getParts() {return cooling;}
}
