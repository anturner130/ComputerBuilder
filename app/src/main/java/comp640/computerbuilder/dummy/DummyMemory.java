package comp640.computerbuilder.dummy;

import java.util.ArrayList;
import java.util.List;

import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;

/**
 * Created by alexanderturner on 5/1/16.
 */
public class DummyMemory implements IDummyParts {

    private PartType type = PartType.Memory;
    private List<Part> memory;

    public List<Part> getParts() {return memory;}

    public DummyMemory()
    {
        memory = new ArrayList<>();

        memory.add(new Part(28,
                "Enhanced ECO2 8GB 240-Pin DDR3 SDRAM DDR3L 1600 (PC3L 12800) Desktop Memory",
                BuildStore.Newegg,
                "The Mushkin Enhanced ECO2 memory combines Mushkinís award-winning performance, an ECOnomical design and the legendary Mushkin reliability to transform your computer into a more powerful ECO-friendly machine. The ECO2 memory delivers a super-fast speed and operates at optimal frequency to address your daily needs in work and entertainment. It works at a low voltage of 1.35V and comes with a stylish, low-profile heatsink for impressive heat dissipation. Moreover, the ECO2 memory is hand tested to guarantee excellent reliability in challenging environments..",
                "Mushkin",
                type,
                "http://www.newegg.com/Desktop-Memory/SubCategory/ID-147?Tid=7611"));

        memory.add(new Part(33,
                "HyperX FURY 8GB 240-Pin DDR3 SDRAM DDR3 1866 Desktop Memory Model HX318C10F",
                BuildStore.Newegg,
                "HyperXÆ FURY DDR3 memory automatically overclocks up to 1866MHz1 for hassle-free, plug-and-play functionality that gets you in the game faster and instant top-level performance that helps you win it. With voltages as low as 1.35V, it draws less power and generates less heat, while supporting Intel's new 100 Series chipset. Its asymmetric, aggressive design lets you stand out from the crowd of \"squared\" designs and features quality aluminum and a diamond-cut finish. It's available in black, blue, white and red with a black PCB to match the latest color schemes of motherboards, cases and other components.",
                "Kingston",
                type,
                "http://www.newegg.com/Product/Product.aspx?Item=9SIA24G2KG1451"));

        memory.add(new Part(200,
                "TridentZ Series 16GB (4 x 4GB) 288-Pin DDR4 SDRAM DDR4 3733 (PC4 29800) Intel Z170 Platform Desktop Memory Model F4-3733C17Q-16GTZ",
                BuildStore.Newegg,
                "Extreme performance DDR4 memory designed for gaming and PC enthusiasts\n" +
                        "Optimized compatibility with DDR4-compatible Intel Core platforms\n" +
                        "Sleek and stylish aluminum heat spreader design\n" +
                        "1.35V ultra low voltage\n" +
                        "Intel XMP 2.0 support",
                "G.Skill",
                type,
                "http://www.newegg.com/Product/Product.aspx?Item=N82E16820231951"));

        memory.add(new Part(74,
                "Ballistix Sport 8GB (2 x 4GB) 288-Pin DDR4 SDRAM DDR4 2400 (PC4 19200) Desktop Memory Model BLS2K4G4D240FSA",
                BuildStore.Newegg,
                "Speed. Style. Sport. Get more out of your memory.\n" +
                        "Designed for performance enthusiasts, gamers, and anyone who simply wants to get more out of their system, Crucial Ballistix Sport LT DDR4 memory helps you do just that. Give your processor the resources it needs to perform and make your computer faster and more responsive.",
                "Crucial",
                type,
                "http://www.newegg.com/Product/Product.aspx?Item=9SIA24G28M5935"));
        memory.add(new Part(35,
                "Ballistix Sport LT 16GB (2 x 8GB) 288-Pin DDR4 SDRAM DDR4 2400 (PC4 19200) Memory Model BLS2K8G4D240FSB",
                BuildStore.Newegg,
                "This G.SKILL Sniper Gaming Series memory kit is designed to complement dual-channel-based chipsets, and eliminates data bottlenecks by doubling your memory bandwidth. Optimized for speed, low latency, and high stability, the Sniper Gaming Series memory is the perfect solution to build a more responsive system.",
                "Crucial",
                type,
                "http://www.newegg.com/Product/Product.aspx?Item=9SIA0AJ3TE0633"));
        memory.add(new Part(8,
                "512MB 184-Pin DDR SDRAM DDR 266 (PC 2100) Desktop Memory Model AC266X64/512/16C - OEM",
                BuildStore.Newegg,
                "Capacity 512MB.Type 184-Pin DDR SDRAM. SpeedDDR 266 (PC 2100). Cas Latency2.5 Voltage 2.5V Heat Spreader No.",
                "AllComponents",
                type,
                "http://www.newegg.com/Product/Product.aspx?Item=N82E16820159103"));
        memory.add(new Part(62,
                "HyperX FURY 16GB Kit (2x8GB) 1866MHz DDR3 CL10 DIMM - Black (HX318C10FBK2/16)",
                BuildStore.Amazon,
                "Asymmetric heat spreader for stylish heat dissipation\n" +
                        "Compatible with Intel and AMD platforms\n" +
                        "Easy to install - Plug-and-Play functionality\n" +
                        "Automatic Overclocking - reach faster speeds and higher capacities by just installing the memory, no adjustments in BIOS needed\n" +
                        "Unique - tested with all popular brands of motherboards\n" +
                        "Reliable - 100-percent factory tested\n" +
                        "Guaranteed - lifetime warranty, free technical support",
                "Kingston",
                type,
                "http://www.amazon.com/Kingston-HyperX-FURY-2x8GB-1866MHz/dp/B00J8E8Y5C/ref=sr_1_1?s=pc&ie=UTF8&qid=1462137877&sr=1-1&keywords=RAM"));
        memory.add(new Part(70,
                "Vengeance Pro 16GB 2x8GB DDR3 2400MHz PC3 19200 Desktop, Red",
                BuildStore.Amazon,
                "Corsair Vengeance Pro Series memory modules are designed for overclocking on the latest 3rd and 4th generation Intel Core platforms, with eight-layer PCBs and ICs specially selected for performance potential. The aluminum heat spreaders provide superior temperature management and have the aggressive look you want in your gaming rig. XMP 1.3 profiles allow for automatic, reliable overclocking.",
                "Corsair",
                type,
                "http://www.amazon.com/Corsair-Vengeance-2x8GB-2400MHz-Desktop/dp/B00EUPV2RQ/ref=sr_1_4?s=pc&ie=UTF8&qid=1462137877&sr=1-4&keywords=RAM"));
        memory.add(new Part(30,
                "Ballistix Sport 8GB Single DDR3 1600 MT/s PC3-12800 CL9 1.5V UDIMM 240-Pin Memory (BLS8G3D1609DS1S00)",
                BuildStore.Amazon,
                "BLS8G3D1609DS1S00 is a single 8GB DDR3 module that operates at speeds up to 1600 MT/s and has a CL9 latency with extended timings of 9-9-9-24. It is Performance and is non-ECC. It conforms to the industry standard UDIMM layout of 240 pins and is compatible with computers that take DDR3 UDIMM memory.",
                "Crucial",
                type,
                "http://www.amazon.com/Crucial-Ballistix-PC3-12800-240-Pin-BLS8G3D1609DS1S00/dp/B006YG9E7O/ref=sr_1_7?s=pc&ie=UTF8&qid=1462137877&sr=1-7&keywords=RAM"));
        memory.add(new Part(11,
                "8GB (4x2GB) MEMORY RAM Fully Buffered PC5300 667MHz 1.8V 240PIN DIMM (DDR2-667MHz 240-pin DIMM)",
                BuildStore.Amazon,
                "When you purchase RAM from 4AllDeals, it comes with a lifetime warranty, as well as lifetime telephone technical support from our US-based technicians. PLEASE NOTE If you do not purchase this module from 4AllDeals direct, you do not get the lifetime warranty or tech support offered in this ad.\n" +
                        "240 pin module\n" +
                        "RAM Memory will speed up your computer!",
                "4AllDeals",
                type,
                "http://www.amazon.com/MEMORY-Buffered-PC5300-DDR2-667MHz-240-pin/dp/B008O51CL4/ref=sr_1_11?s=pc&ie=UTF8&qid=1462137877&sr=1-11&keywords=RAM"));
        memory.add(new Part(185,
                "32GB (2 x 16GB) Ripjaws V Series DDR4 PC4-25600 3200MHz for Intel Z170 Platform Desktop Memory Model F4-3200C16D-32GVK",
                BuildStore.Amazon,
                "Extreme performance DDR4 memory designed for gaming and PC enthusiasts Optimized compatibility with DDR4-compatible Intel Core platforms Sleek and stylish aluminum heat spreader design Intel XMP 2.0 support Ultra-high capacity 16GB modules Series Ripjaws V, Memory Type DDR4, Capacity 32GB (16GBx2), Multi-Channel Kit Dual Channel Kit, Tested Speed 3200MHz , Tested Latency 16-18-18-38-2N, Tested Voltage 1.35v, Registered/Unbuffered Unbuffered, Error Checking Non-ECC, SPD Speed 2133MHz , SPD Voltage 1.20v, Fan lncluded No, height 42 mm / 1.65 inch, Warranty Limited Lifetime Features: Intel XMP 2.0 (Extreme Memory Profile) Ready",
                "G.Skill",
                type,
                "http://www.amazon.com/G-SKILL-Ripjaws-PC4-25600-Platform-F4-3200C16D-32GVK/dp/B0171GQR0C/ref=sr_1_18?s=pc&ie=UTF8&qid=1462137877&sr=1-18&keywords=RAM"));
        memory.add(new Part(38,
                "8GB (1x8GB) Laptop Memory Upgrade for Lenovo Thinkpad T440p, T450, T450s, T540p, T550 DDR3 1600Mhz PC3-12800 SODIMM 2Rx8 CL11 1.35v Notebook RAM",
                BuildStore.Amazon,
                "Not compatible with all laptops! Wondering if your device will be compatible? We offer free technical support from our own certified technicians. Adamanta memory modules comes with limited Lifetime Warranty so you know you will have the support for your investment. Don't trust just any memory module out there. Adamanta memory is fully tested by the manufacturer.",
                "Adamanta",
                type,
                "http://www.amazon.com/Adamanta-Memory-Thinkpad-PC3-12800-Notebook/dp/B01B55442I/ref=sr_1_25?s=pc&ie=UTF8&qid=1462137877&sr=1-25-spons&keywords=RAM&psc=1"));
        memory.add(new Part(150,
                "8GB (1x8GB) Laptop Memory Upgrade for Lenovo Thinkpad T440p, T450, T450s, T540p, T550 DDR3 1600Mhz PC3-12800 SODIMM 2Rx8 CL11 1.35v Notebook RAM",
                BuildStore.Amazon,
                "Upgrading your PC with a Samsung SSD is the most economical way to breathe new life into an aging PC. The 850 EVO reads, writes and multi-tasks at incredible speeds, enhancing boot-up speed, application loading and multi-tasking performance. It's more than an upgrade, it's a complete transformation of your PC.",
                "Samsung",
                type,
                "http://www.amazon.com/Samsung-2-5-Inch-Internal-MZ-75E500B-AM/dp/B00OBRE5UE/ref=pd_sim_sbs_147_7?ie=UTF8&dpID=41fw65-8tpL&dpSrc=sims&preST=_AC_UL160_SR160%2C160_&refRID=0RG2TVA6QN8D5HFTMVH6"));

    }


}
