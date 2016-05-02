package comp640.computerbuilder.dummy;

import java.util.ArrayList;
import java.util.List;

import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;

/**
 * Created by alexanderturner on 5/1/16.
 */
public class DummyMotherboards implements IDummyParts {

    private PartType type = PartType.Motherboard;
    private List<Part> motherboards;

    public List<Part> getParts() {return motherboards;}

    public DummyMotherboards()
    {
        motherboards = new ArrayList<>();

        motherboards.add(new Part(75,
                "M5A97 LE R2.0 AM3+ AMD 970 + SB950 SATA 6Gb/s USB 3.0 ATX AMD Motherboard with UEFI BIOS",
                BuildStore.Newegg,
                "M5A97 LE R2.0 supports AMDÆ AM3+ / AM3 multi-core processors with unique L3 cache and delivers better overclocking capabilities with less power consumption. It features dual-channel DDR3 1866 memory support and accelerates data transfer rate up to 5200MTps via HyperTransportô 3.0-based system bus. This motherboard also supports AMDÆ CPUs in the new 32nm manufacturing",
                "Asus",
                type,
                "http://images17.newegg.com/is/image/newegg/13-131-872-TS?$S640W$"));
        motherboards.add(new Part(61,
                "A88M-G/3.1 FM2+ / FM2 A88X (Bolton D4) Micro ATX Motherboard",
                BuildStore.Newegg,
                "AMD A88X (Bolton D4)\n" +
                        "FM2+ 95W / FM2 100W processors\n" +
                        "DDR3 2400+(OC) / 2133 / 1866 / 1600 / 1333 / 1066",
                "ASRock",
                type,
                "http://images10.newegg.com/ProductImage/13-157-689-01.jpg"));
        motherboards.add(new Part(150,
                "ROG CROSSBLADE RANGER FM2+ AMD A88X (Bolton D4) SATA 6Gb/s USB 3.0 HDMI ATX AMD Gaming Motherboard",
                BuildStore.Newegg,
                "AMD Socket FM2+ Athlonô / A-series processors\n" +
                        "AMD A88X FCH (Bolton D4) chipset\n" +
                        "Intelô Ethernet + LANGuard + GameFirst III - Game networking taken to the next level\n" +
                        "SupremeFX 2014 + Sonic Radar II - New and improved audio that's beyond compare\n" +
                        "KeyBot - An instant keyboard upgrade\n" +
                        "Gamer's Guardian - All around protection for the best quality, reliability and durability",
                "Asus",
                type,
                "http://images17.newegg.com/is/image/newegg/13-132-255-TS?$S640$"));
        motherboards.add(new Part(180,
                "SABERTOOTH 990FX R2.0 AM3+ AMD 990FX + SB950 SATA 6Gb/s USB 3.0 ATX AMD Motherboard with UEFI BIOS",
                BuildStore.Newegg,
                "UF CeraM!X Heatsink Coating Tech. - 50% Larger Area for Heat Dissipation with the Revolutionary Ceramics-coating Technology.\n" +
                        "TUF Thermal Radar - Real Time Temp. Detection and Heat Removal\n" +
                        "TUF Components [Alloy Choke, Cap. & MOSFET; Certified by Military-standard] - Certified for Tough Duty\n" +
                        "New DIGI+ Power Control - All-New Digital Power Control for both CPU and DRAM\n" +
                        "USB BIOS Flashback - Easy, Worry-free USB BIOS Flashback with Hardware-based Design\n" +
                        "Remote GO! - One-stop PC Remote Control and Home Entertainment\n" +
                        "Windows 8 Ready - Assured Compatibility",
                "Asus",
                type,
                "http://images17.newegg.com/is/image/newegg/13-131-877-TS?$S640W$"));
        motherboards.add(new Part(70,
                "970A-G43 Plus AM3+/AM3 AMD 970 & SB950 SATA 6Gb/s USB 3.1 ATX AMD Motherboard",
                BuildStore.Newegg,
                "Supports AMD FX / Phenom II / Athlon II / Sempron processors for AM3+ socket\n" +
                        "Supports DDR3 Memory\n" +
                        "Military Class 4: Top Quality & Stability\n" +
                        "Military Class Essentials: Total Protection for Military Class Motherboards\n" +
                        "OC Genie 4: Overclock in 1 Second\n" +
                        "Click BIOS 4: Easily Fine-tune Your System\n" +
                        "PCI Express Gen 2: World's 1st PCI Express Gen 2 Motherboard Brand\n" +
                        "Multi-GPU: AMD CrossFire Support\n" +
                        "Command Center: Control & Customize Your PC Settings\n" +
                        "Fast Boot: Quickly Boot Up & Enter OS in A Few Seconds\n" +
                        "Multi-GPU Support\n" +
                        "- Supports 2-Way AMD CrossFire Technology\n" +
                        "BIOS\n" +
                        "- The motherboard BIOS provides \"Plug & Play\" BIOS which detects the peripheral devices and expansion cards of the board automatically\n" +
                        "- The motherboard provides a Desktop Management Interface(DMI) function which records your motherboard specifications\n" +
                        "Mounting\n" +
                        "- 6 mounting holes",
                "MSI",
                type,
                "http://images17.newegg.com/is/image/newegg/13-130-922-TS?$S640$"));
        motherboards.add(new Part(50,
                "A68HM-GRENADE FM2+ AMD A68H SATA 6Gb/s USB 3.0 HDMI Micro ATX AMD Motherboard",
                BuildStore.Newegg,
                "Supports AMD Socket FM2+/FM2 A-Series/Athlon Processors\n" +
                        "Supports DDR3 Memory\n" +
                        "Military Class 4: Top Quality & Stability\n" +
                        "Military Class Essentials: Total Protection for Military Class Motherboards\n" +
                        "Fast Boot: Quickly Boot Up & Enter OS in A Few Seconds",
                "MSI",
                type,
                "http://images17.newegg.com/is/image/newegg/13-130-856-TS?$S640W$"));
        motherboards.add(new Part(49,
                "A68HM-E FM2+ AMD A68H FCH (Bolton D2H) SATA 6Gb/s USB 3.0 Micro ATX AMD Motherboard",
                BuildStore.Newegg,
                "FM2+ socketed motherboard features enduring 5X Protection, high-clarity audio and the new UEFI BIOS on the A68H chipset\n" +
                        "- Proven quality - 5X Protection. 1000+ compatible devices. 7000+ validation hours\n" +
                        "- Audio Features - Audio that roars on the battlefield\n" +
                        "- New UEFI BIOS - The Smoothest and Slickest Mouse-controlled Graphical BIOS\n" +
                        "- USB 3.0 Boost (UASP Support) - 170% faster transfer speeds than traditional USB 3.0",
                "Asus",
                type,
                "http://images17.newegg.com/is/image/newegg/13-132-407-TS?$S640W$"));
        motherboards.add(new Part(57,
                "FM2A78M Pro3+ FM2+ 95W / FM2 100W AMD A78 (Bolton D3) SATA 6Gb/s USB 3.0 HDMI Micro ATX AMD Motherboard",
                BuildStore.Newegg,
                "A great foundation for you to build a FM2+/FM2 APU-based system, the ASRock FM2A78M PRO3+ motherboard delivers performance, features, and quality at a great price. It's based on an AMD A78 (Bolton D3) chipset and supports an FM2+ 95W/FM2 100W processor. This motherboard is built to be stable and durable with an all solid capacitor design. Compute with confidence with Full Spike Protection that safeguards sensitive components against voltage abnormalities. Turbocharge the performance with one key with X-Boost technology. Experience blistering data transfer with the native SATA III and USB 3.0 technology. And enjoy clean, noise-minimized sound thanks to the ELNA audio caps. The acclaimed ASRock XFast RAM and XFast LAN are also incorporated, for a fast, smooth experience in both local operation and on the Internet.",
                "ASRock",
                type,
                "http://images17.newegg.com/is/image/newegg/13-157-570-TS?$S640W$"));
        motherboards.add(new Part(190,
                "GA-Z97X-UD5H LGA 1150 Intel Z97 HDMI SATA 6Gb/s USB 3.0 ATX Intel Motherboard\n" +
                        "Brand:Gigabyte",
                BuildStore.Newegg,
                "Supports 4th and 5th Generation IntelÆ Coreô processors\n" +
                        "Extreme multi graphics support\n" +
                        "Precise digital CPU power design\n" +
                        "SATA Express support for 10Gbps data transfer\n" +
                        "M.2 for SSDs drives with up to 10Gbps data transfer\n" +
                        "Killerô E2200 and Intel gaming networking\n" +
                        "Realtek ALC1150 115dB SNR HD Audio with built-in rear audio amplifier\n" +
                        "2x copper PCB design\n" +
                        "Long lifespan Durable Black Solid caps\n" +
                        "APP Center including EasyTuneô and Cloud Stationô utilities\n" +
                        "GIGABYTE UEFI DualBIOSô",
                "Brand:Gigabyte",
                type,
                "http://images10.newegg.com/ProductImage/13-128-707-14.jpg"));
        motherboards.add(new Part(280,
                "X99 Extreme6 LGA 2011-v3 Intel X99 SATA 6Gb/s USB 3.0 ATX Intel Motherboard",
                BuildStore.Newegg,
                "ASRock Super Alloy\n" +
                        "XXL Aluminum Alloy Heatsink\n" +
                        "Premium 60A Power Choke\n" +
                        "Premium Memory Alloy Choke\n" +
                        "Ultra Dual-N MOSFET (UDM)\n" +
                        "Nichicon 12K Platinum Caps\n" +
                        "Sapphire Black PCB\n" +
                        "Supports IntelÆ Coreôi7 and XeonÆ 18-Core Processors Family for the LGA 2011-3 Socket\n" +
                        "Digi Power, 12 Power Phase design, Multiple Filter Cap (MFC)\n" +
                        "Supports Quad Channel DDR4 3000+(OC) memory with max. capacity up to 128GB\n" +
                        "Supports ECC*, RDIMM Memory \n" +
                        "(*ECC is supported with Intel Xeon processors.)\n" +
                        "3 PCIe 3.0 x16, 2 PCIe 2.0 x1, 1 mini-PCIe\n" +
                        "Supports AMD 3-Way CrossFireXTM and NVIDIAÆ 3-Way SLITM\n" +
                        "7.1-Channel HD Audio with Content Protection (Realtek ALC1150 Audio Codec), Supports Purity SoundTM 2 & DTS Connect\n" +
                        "IntelÆ Gigabit LAN + Qualcomm Atheros Gigabit LAN\n" +
                        "10 SATA3, 1 eSATA, 1 Ultra M.2 (PCIe Gen3 x4 & SATA3)\n" +
                        "10 USB 3.0 (4 Front, 6 Rear), 7 USB 2.0 (4 Front, 2 Back, 1 Vertical Type A)\n" +
                        "1 COM Port Header, 1 Thunderbolt AIC Connector\n" +
                        "Supports ASRock Cloud, HDD Saver Technology, Full Spike Protection, APP Shop",
                "ASRock",
                type,
                "http://images10.newegg.com/ProductImage/13-128-707-14.jpg"));
        motherboards.add(new Part(220,
                "Z97 OC Formula LGA 1150 Intel Z97 HDMI SATA 6Gb/s USB 3.0 ATX Intel Motherboard",
                BuildStore.Newegg,
                "ASRock Super Alloy\n" +
                        "-XXL Aluminum Alloy Heatsink \n" +
                        "-Premium Alloy Choke (Reduces 70% core loss compared to iron powder choke)\n" +
                        "-Dual-Stack MOSFET (DSM) \n" +
                        "-NexFETô MOSFET\n" +
                        "-12K Platinum Caps (100% Japan made high quality conductive polymer capacitors)\n" +
                        "-Sapphire Black PCB\n" +
                        "ASRock HDD Saver Technology\n" +
                        "ASRock Full Spike Protection\n" +
                        "ASRock Conformal Coating\n" +
                        "ASRock Cloud\n" +
                        "ASRock APP Shop\n" +
                        "OC Formula Power Kit\n" +
                        "-12 Power Phase design\n" +
                        "-Digi Power\n" +
                        "-Dual-Stack MOSFET (DSM) \n" +
                        "-Multiple Filter Cap (MFC) (Filter different noise by 3 different capacitors: DIP solid cap, POSCAP and MLCC)\n" +
                        "-Premium Alloy Choke (Reduces 70% core loss compared to iron powder choke)\n" +
                        "OC Formula Connector Kit\n" +
                        "-Hi-Density Power Connector (8 pin)\n" +
                        "-15µGold Contact (CPU sockets, memory sockets and PCIE x16 slots)\n" +
                        "OC Formula Cooling Kit\n" +
                        "-8 Layer PCB\n" +
                        "-4 x 2oz copper\n" +
                        "OC Formula Monitor Kit \n" +
                        "-Multi Thermal Sensor",
                "ASRock",
                type,
                "http://images17.newegg.com/is/image/newegg/13-157-502-TS?$S640$"));
        motherboards.add(new Part(1000,
                "ROG RAMPAGE IV BLACK EDITION LGA 2011 Intel X79 SATA 6Gb/s USB 3.0 Extended ATX Intel Gaming Motherboard",
                BuildStore.Newegg,
                "Following in the legacy forged by the Rampage 111 Black Edition, the R4BE - as it is known by ROG fans - is the perfect marriage of gaming and overlocking. Sacrificing nothing to appease both crowds, the Rampage IV Black Edition delivers the ultimate X79 experience.",
                "Asus",
                type,
                "http://images17.newegg.com/is/image/newegg/13-132-053-TS?$S640$"));
        motherboards.add(new Part(78,
                "Intel B85 LGA 1150 DDR3 USB 3.1 ATX Motherboard (B85-G41 PC Mate)\n" +
                        "Brand: MSI",
                BuildStore.Amazon,
                "MSI B85-G41 PC MATE LGA1150/ Intel B85/ DDR3/ Crossfire/ SATA3&USB3.0/ A & GBE/ ATX Motherboard",
                "MSI",
                type,
                "http://ecx.images-amazon.com/images/I/51P7T3gV99L.jpg"));
        motherboards.add(new Part(113,
                "970 GAMING DDR3 2133 ATX AMD Motherboard",
                BuildStore.Amazon,
                "CPU: Socket AM3+\n" +
                        "Memory: 4x DDR3-2133(OC)/ 1866/ 1600/ 1333/ 1066 DIMM Slots, Dual Channel, Max Capacity of 32GB\n" +
                        "Slots: 2x PCI-Express 2.0 x16 Slots (One runs at x8), 2x PCI-Express 2.0 x1 Slots, 2x PCI Slots\n" +
                        "SATA: 6x SATA3 Ports\n" +
                        "Ports: 4x USB 3.0 Ports (2 rear, 2 via header), 14x USB 2.0 Ports (8 rear, 6 via headers), 1x PS/2 keyboard/Mouse Combo Port, 1x Optical S/PDIF-Out, 1x RJ45 LAN Port, Audio I/O Jacks",
                "MSI",
                type,
                "http://ecx.images-amazon.com/images/I/51XiDG5rPyL.jpg"));
        motherboards.add(new Part(299,
                "Enthuastic Gaming Intel Z170A LGA 1151 DDR4 USB 3.1 ATX Motherboard (Z170A XPower Gaming Titanium Edition)",
                BuildStore.Amazon,
                "LGA1151, Supports 6th Generation Intel Core Trade i7/ i5/ i3/ Pentium/ Celeron Processors\n" +
                        "Chipset: Intel Z170 Express\n" +
                        "Memory: 4x DDR4-3600(OC)/ 3200(OC)/ 3000(OC)/ 2800(OC)/ 2600(OC)/ 2400/ 2133 MHz DIMM Slots, Dual Channel, ECC, Unbuffered, Max Capacity of 64GB\n" +
                        "Slots: 4x PCI-Express 3.0 x16 Slots (run at x16/x0/x0/x4 or x8/x0/x8/x4 or x8/x4/x4/x4), 3x PCI-Express 3.0 x1 Slots\n" +
                        "Multi-Graphics: Supports AMD 4-Way CrossFireX and NVIDIA 2-Way SLI Technology\n" +
                        "SATA: 8x SATA3 Ports, Support RAID 0, 1, 5, 10; 2x SATA Express Ports (PCI-Express 3.0 x2)\n" +
                        "Audio: Realtek ALC1150 7.1-Channel High Definition Audio CODEC, Supports S/PDIF Output",
                "MSI",
                type,
                "http://ecx.images-amazon.com/images/I/91y1xw2gZ2L._SL1500_.jpg"));
        motherboards.add(new Part(540,
                "Extreme Gaming Intel X99 LGA 2011 DDR4 USB 3.1 Extended ATX Motherboard (X99A GODlike Gaming )",
                BuildStore.Amazon,
                "LGA 2011-v3, Support New Intel Core i7 Processors Extreme Edition, FSB/Hyper Transport Bus 100/ 125/ 167MHz\n" +
                        "Chipset: Intel X99 Express\n" +
                        "Memory: 8x DDR4-3400(OC)/ 3333(OC)/ 3110(OC)/ 3000(OC)/ 2800(OC)/ 2750(OC)/ 2666(OC)/ 2600(OC)/ 2400(OC)/ 2200(OC)/ 2133 DIMM Slots, Quad-Channel, Non-ECC, Unbuffered, Max Capacity up to 128GB\n" +
                        "Slots: 5x PCI-Express 3.0 x16 Slots (run at x16/x0/x0/x0/x0 or x16/x0/x0/x16/x0, x16/x0/x0/x8/x0 or x16/x0/x0/x16/x8, x8/x8/x0/x8/x0 or x8/x8/x0/x16/x8, x8/x8/x0/x8/x4)\n" +
                        "Multi-Graphics: Supports AMD 4-Way CrossFireX and NVIDIA 4-Way SLI, 3-Way SLI Technology\n" +
                        "SATA: 10x SATA3 Ports, Six Support RAID 0, 1, 5, 10, Four Only Support IDE Mode and AHCI Mode; 1x SATA Express Port\n" +
                        "Audio: Realtek ALC1150 7.1-Channel High Definition Audio CODEC, Supports S/PDIF Output\n" +
                        "LAN: 2x Killer E2400 Gigabit Ethernet Controller; Wi-Fi 802.11 a/b/g/n/ac Wireless LAN (2.4/5GHz); Bluetooth v4.0 (Includes BLE and Bluetooth 3.0+HS)",
                "MSI",
                type,
                "http://ecx.images-amazon.com/images/I/91jipBRac0L._SL1500_.jpg"));
        motherboards.add(new Part(399,
                "ROG MAXIMUS VII FORMULA LGA1150 DDR3 M.2 ACWiFi USB 3.0 Intel Z97 ATX Motherboard",
                BuildStore.Amazon,
                "Intel Ethernet, LAN Guard, Game First III\n" +
                        "SupremeFX Formula 2014, Sonic Radar II\n" +
                        "Chipset: Intel Z97, Memory: 4 x DIMM, Max. 32GB, DDR3 3300(O.C.)/3200(O.C.)/3100(O.C.)/3000(O.C.)/2933(O.C.)/2800(O.C.)/2666(O.C.)/2400(O.C.)/2133(O.C.)/2000(O.C.)/1866(O.C.)/1600/1333 MHz Non-ECC, Un-buffered Memory Dual Channel Memory Architectur\n" +
                        "Free keyboard upgrade and mPCIe Combo III compact card\n" +
                        "Luxuriate in the smart design, premium components, durable materials and tough double-sided armor",
                "Asus",
                type,
                "http://ecx.images-amazon.com/images/I/91-sjw0lh4L._SL1500_.jpg"));
        motherboards.add(new Part(105,
                "Intel Desktop Board Media Series ATX Form Factor for Second Generation Intel Core Family Processors BOXDH67CLB3",
                BuildStore.Amazon,
                "The boxed Intel Desktop Board DH67CLB3 includes: ATX I/O shield, SATA cables, I/O layout stickers, quick reference guide and driver and software DVD\n" +
                        "Intel H67 Express Chipset\n" +
                        "Four 240-pin DIMM connectors for dual-channel DDR3 1333/1066 MHz memory support for up to 32 GB maximum memory\n" +
                        "Two USB 3.0 back-panel ports; fourteen USB 2.0 ports, six back-panel ports, and eight additional ports via four internal headers\n" +
                        "Supports the 2nd gen Intel Core processors, including the Intel Core i7 and Intel Core i5 processors\n" +
                        "Supports Intel Built-in Visuals\n" +
                        "Supports Intel Rapid Storage Technology, including RAID 0, 1, 5, 10 with Intel Rapid Recover Technology",
                "Intel",
                type,
                "http://ecx.images-amazon.com/images/I/51O2eVyTX-L.jpg"));
        motherboards.add(new Part(55,
                "AM3+ AMD DDR3 1333 760G HDMI USB 3.0 Micro ATX Motherboard GA-78LMT-USB3",
                BuildStore.Amazon,
                "Socket AM3+\n" +
                        "Chipset: North Bridge AMD 760G & South Bridge SB710\n" +
                        "Memory: 4x 240pin DDR3-1333+(O.C.)/1066 DIMM Slots, Dual Channel, Max Capacity of 32GB\n" +
                        "Slots: 1x PCI-Express 2.0 x16 Slot, 1x PCI-Express 2.0 x1 Slot, 1x PCI Slot\n" +
                        "Windows 8 Ready\n" +
                        "CPU: AM3+ socket Support for AMD AM3+ processor,AMD AM3 Phenom II processor / AMD Athlon II processor\n" +
                        "Memory: 4 x 1.5V DDR3 DIMM sockets supporting up to 32 GB of system memory / Support for 1333+ (O.C.)/1066 MHz memory modules\n" +
                        "LAN: 1 x Realtek GbE LAN chip (10/100/1000 Mbit)",
                "Gigabyte",
                type,
                "http://ecx.images-amazon.com/images/I/81kZsTGlG9L._SL1500_.jpg"));
        motherboards.add(new Part(51,
                "FM2+ AMD A78 HDMI Dual-Link DVI D-Sub UEFI BIOS mATX DDR3 2133 Motherboard GA-F2A78M-HD2",
                BuildStore.Amazon,
                "Socket FM2+\n" +
                        "Memory: 2x DDR3-2400(OC)/ 2133/ 1866/ 1600/ 1333 DIMM Slots, Dual Channel, Max Capacity of 64GB\n" +
                        "Slots: 1x PCI-Express 3.0 x16 Slot, 1x PCI-Express 2.0 x1 Slot, 1x PCI Slot\n" +
                        "SATA: 4x SATA3 Ports, Support RAID 0, 1, 10 and JBOD\n" +
                        "APU Support: AMD A series processors; AMD Athlon series processors\n" +
                        "Chipset: AMD A78\n" +
                        "Memory: 2 x 15V DDR3 DIMM sockets supporting up to 64 GB of system memory; Support for DDR3 2400(OC)/2133/1866/1600/1333 MHz memory modules\n" +
                        "Onboard Graphics: 1 x D-Sub port, supporting a maximum resolution of 1920x1200; 1 x DVI-D port, supporting a maximum resolution of 2560x1600; 1 x HDMI port, supporting a maximum resolution of 4096x2160\n" +
                        "LAN: Realtek GbE LAN chip (10/100/1000 Mbit)\n" +
                        "Expansion Slots: 1 x PCI Express x16 slot, running at x16; 1 x PCI Express x1 slot\n" +
                        "Support for AMD Dual Graphics technology\n" +
                        "Storage Interface: 4 x SATA 6Gb/s connectors; Support for RAID 0, RAID 1, RAID 10, and JBOD",
                "Gigabyte",
                type,
                "http://ecx.images-amazon.com/images/I/71La6bumZ3L._SL1000_.jpg"));

    }


}
