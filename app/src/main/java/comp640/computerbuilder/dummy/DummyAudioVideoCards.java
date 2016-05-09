package comp640.computerbuilder.dummy;

import java.util.ArrayList;
import java.util.List;

import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;

/**
 * Created by alexanderturner on 4/25/16.
 */
public class DummyAudioVideoCards implements IDummyParts{

    private PartType type = PartType.Audio_Video_Card;
    private List<Part> audioVideoCards;

    public List<Part> getParts() {return audioVideoCards;}

    public DummyAudioVideoCards()
    {
        audioVideoCards = new ArrayList<>();

        audioVideoCards.add(new Part(209, "NITRO Radeon R9 380 DirectX 12 100384NT4GOC-2L 4GB 256-Bit GDDR5 PCI Express 3.0 x16 HDCP Ready Dual-X OC Version w/ backplate (UEFI) Video Card", BuildStore.Newegg, "The new SAPPHIRE NITRO series is an evolution of our market-leading, award-winning, high-end graphics card technology. Designed from the ground up, we've crammed in everything you need (and left out everything you don't) to maximize the gaming experience for your budget", "Sapphire", type,
                "http://images10.newegg.com/ProductImage/14-202-166-01.jpg"));
        audioVideoCards.add(new Part(199, "GeForce GTX 960 DirectX 12 04G-P4-3965-KR 4GB 128-Bit GDDR5 PCI Express 3.0 SLI Support ACX 2.0+ Video Card", BuildStore.Newegg, "The EVGA GeForce GTX 960 04G-P4-3965-KR Video Card delivers faster performance and better power efficiency than previous generation cards, making it a perfect upgrade solution. This video card comes with support for Microsoft DirectX 12, and is built around 1024 CUDA cores with 4 GB of high speed GDDR5 memory, giving you higher texture qualities and better 4K performance. It utilizes an array of innovative NVIDIA technologies ñ like NVIDIA Voxel Global Illumination (VXGI), smooth, tear¨free NVIDIA G¨SYNC, Dynamic Super Resolution, GameStream and more ñ for unmatched visual effects.\n" +
                "\n" +
                "High performance and quick response means a large amount of heat will be generated. The EVGA ACX 2.0+ cooling technology provides superb cooling performance for the GPU.", "Evga", type,
                "http://images10.newegg.com/ProductImage/14-487-224-10.jpg"));
        audioVideoCards.add(new Part(184, "GeForce GTX 960 4GB WINDFORCE 2X OC EDITION", BuildStore.Newegg, "Supercharge your gaming experience with the NVIDIA GeForce GTX 960 video card. The GeForce GTX 960 GPU is powered by the next generation NVIDIA Maxwell architecture, delivering unmatched performance at incredibly lower power consumption when compared to previous generation. 1024 CUDA Cores and 4GB GDDR5 memory in 128-bit width work side by side for game redefining performance - you can play today's hottest titles with challenging setting and smooth, skip-free pictures.", "Gigabyte", type,
                "http://images17.newegg.com/is/image/newegg/14-125-802-TS?$S640W$"));
        audioVideoCards.add(new Part(369, "Radeon R9 390X DirectX 12 R9-390X-8256 8GB 512-Bit GDDR5 PCI Express 3.0 CrossFireX Support Video Card", BuildStore.Newegg, "he XFX Radeon R9 390 Series graphics cards puts premium 4K gaming and Virtual Reality within reach. Experience smooth, true-to-life and stutter-free gameplay with ultra-high performance and resolution thanks the 8gb of onboard memory.\n" +
                "\n" +
                "A whole new dimension of gaming, for a whole new reality. Your days of gaming in mere HD are behind you. All the power you need for the most immersive 4K gaming experience and beyond, now and tomorrow.\n" +
                "\n" +
                "Radeon is Gaming", "XFX", type,
                "http://images17.newegg.com/is/image/newegg/14-150-727-TS?$S640$"));
        audioVideoCards.add(new Part(567, "Radeon R9 380 DirectX 12 GV-R938G1 GAMING-4GD 4GB 256-Bit GDDR5 PCI Express 3.0 HDCP Ready ATX Video Card", BuildStore.Newegg, "The AMD Radeon R9 380 video card is built for you to game at maximum details in 1080p, 1440p, and all the way to 4K resolution. Based on the latest generation of AMD GCN architecture, this card features 1792 Stream Processors and 4GB 256-bit GDDR5 memory, delivering new levels of performance and capability craved by serious gamers. A rich array of AMD GPU technologies is included, offering more than one way to elevate your gaming experience, like AMD Freesync Technology for smooth, tear-free gaming, Frame Rate Target Control (FRTC) for less power consumption by limiting the target frame rate, and Virtual Super Resolution (VSR) that delivers brilliant 4K experience, even on a 1080p display.\n" +
                "\n" +
                "This card is BIOS overclocked to 990MHz Core Clock (Standard: 970MHz) to extract more performance out of the box.", "Gigabyte", type,
                "http://images17.newegg.com/is/image/newegg/14-125-793-TS?$S640$"));
        audioVideoCards.add(new Part(170, "Radeon HD 6450 DirectX 11 HD-645X-ZQHP 1GB 64-Bit GDDR3 PCI Express 2.1 CrossFireX Support Low Profile Video Card", BuildStore.Newegg, "625 MHz GPU Core Clock\n" +
                "\n" +
                "1GB GDDR3 High Speed Memory\n" +
                "\n" +
                "AMD HD3D Technology\n" +
                "\n" +
                "PCI-E 2.1 Bus Support\n" +
                "\n" +
                "Microsoft DirectX 11 Support\n" +
                "\n" +
                "AMD CrossFireX multi-GPU Support\n" +
                "\n" +
                "3rd Generation TeraScale Engine\n" +
                "\n" +
                "Accelerated Video Transcoding, Encoding, and Upscaling\n" +
                "\n" +
                "AMD PowerPlay Technology\n" +
                "\n" +
                "Enhanced Unified Video Decoder (UVD 3)\n" +
                "\n" +
                "Enhanced Internet Browser Application Support\n" +
                "\n" +
                "Enhanced Microsoft Office 2010 Support\n" +
                "\n" +
                "HDMI 1.4a with support for stereoscopic 3D, Deep Color and xvyCC extended gamut", "XFX", type,
                "http://images10.newegg.com/ProductImage/14-150-766-01.jpg"));
        audioVideoCards.add(new Part(167, "GeForce GTX 980Ti 6GB XTREME GAMING EDITION", BuildStore.Newegg, "WINDFORCE 3X 700W cooling system\n" +
                "Powered by NVIDIA GeForce GTX 980 Ti GPU\n" +
                "Integrated with industry's best 6GB GDDR5 memory and 384-bit memory interface\n" +
                "Boost:1114 MHz/ Base:1026 MHz in OC Mode\n" +
                "Boost:1075 MHz/ Base: 1000 MHz in Gaming Mode\n" +
                "Features Dual-link DVI-I / HDMI / DisplayPort*3\n" +
                "Recommended system power supply requirement: 600W (with two 8-pin external power connector)", "Gigabyte", type,
                "http://images10.newegg.com/ProductImage/14-125-846-01.jpg"));
        audioVideoCards.add(new Part(94, "Sound Blaster Z PCIe 116dB SNR Gaming Sound Card with 600ohm Headphone Amp and Beamforming Microphone", BuildStore.Newegg, "Designed around the powerful Sound Core3Dô audio processor, the Sound Blaster Z series once again raises the bar for the industry standard of PCIe sound cards. Sound Blaster Z has been designed to meet the standards of those who want a vastly superior experience over motherboard audio. With external DACs delivering 116dB SNR, a 600 ohm audiophile-grade headphone amp, and massively customizable SBX Pro Studio technologies, Sound Blaster Z packs a serious audio punch.", "Creative", type,
                "http://images17.newegg.com/is/image/newegg/29-102-048-TS?$S640$"));
        audioVideoCards.add(new Part(119, "Sound Blaster Zx 116 dB PCIe Gaming Sound Card with 600ohm Headphone Amp and Desktop Audio Control Module", BuildStore.Newegg, "Designed around the powerful Sound Core3Dô audio processor, the Sound Blaster Z-Series once again raises the bar for the industry standard of PCIe sound cards. Sound Blaster Zx has been designed to meet the standards of those who want a vastly superior experience over motherboard audio. With external DACs delivering 116dB SNR, a 600 ohm audiophile-grade headphone amp, and massively customizable SBX Pro Studioô technologies, Sound Blaster Zx packs a serious audio punch", "Creative", type,
                "http://images17.newegg.com/is/image/newegg/29-102-049-TS?$S640$"));
        audioVideoCards.add(new Part(54, "Sound Blaster AUDIGY FX Sound Card with SBX Pro Studio - OEM", BuildStore.Newegg, "The Sound Blaster Audigy Fx 5.1 PCIe sound card is the perfect upgrade from basic motherboard audio to legendary Sound Blaster audio. Powered by SBX Pro Studio technology, the half-height sound card instantly converts your system to a 5.1 entertainment system, delivering cinematic surround sound for your movies, music and games. It features a 24-bit 192kHz digital-to-analog converter (playback), 106dB SNR and a high-end 600-ohm headphone amplifier for studio-grade monitoring. The independent line-in and microphone connectors let you simultaneously connect your PC to two different audio sources. The Sound Blaster Audigy Fx Control Panel gives you full control of your SBX Pro Studio settings. Interchangeable full-height and half-height metal brackets are included to ensure wide compatibility with cases of various sizes.", "Creative", type,
                "http://images10.newegg.com/ProductImage/29-102-067-01.jpg"));
        audioVideoCards.add(new Part(30, "GeForce 8400GS 1GB SDDR3", BuildStore.Amazon, "Awesome features at an incredible value - the EVGA GeForce 8400 GS graphics cared delivers. Essential for watching HD DVD and Blu-ray movies on a PC, accelerating the Microsoft Windows Vista/7 experience, and powering Microsoft DirectX 9 and DirectX 10 games. Specifications include 520 MHz core clock, 1024MB (1GB) of DDR3 memory with a 600 MHz memory clock and 4.8 GB/second memory bandwidth, 64 bit memory bit width, 1230 MHz Shader Clock, 8 CUDA cores, and PCI Express 2.0 compatibility. Additional features include Microsoft DirectX 10 Shader Model 4.0 Support, NVIDIA PureVideo HD Technology, NVIDIA CUDA technology, OpenGL support, PCI-Express 2.0 support, Dual Link HDCP capability and Microsoft Windows XP/Vista/7 support. Connections are DVI, HDMI and VGA. Package includes the EVGA Driver/software disc and a limited 2 year warranty if registered within 30 days at www.evga.com.Minimum of a 350 Watt power supply.(Minimum recommended power supply with +12 Volt current rating of 18 Amps)", "Evga", type,
                "http://ecx.images-amazon.com/images/I/515cmQz%2B15L.jpg"));
        audioVideoCards.add(new Part(163, "R7 370 GAMING 4G Graphics Card", BuildStore.Amazon, "MSI AMD Radeon R7 370 GAMING 4GB GDDR5 2DVI/HDMI/DisplayPort PCI-Express Video Card", "MSI", type,
                "http://ecx.images-amazon.com/images/I/814DeoTW5lL._SL1500_.jpg"));
        audioVideoCards.add(new Part(18, "PCI Express Pci-e 5.1ch 6channels Digital Cmi8738 Audio Sound Card SFF", BuildStore.Amazon, "Chipset: CMI8738-4CH \n" +
                "System interface: 32-bit PCI express x1 Bus Master \n" +
                "Provides audio fidelity that rivals movie theaters with 4channel digital sound \n" +
                "Customize Internet audio with the power and surround sound of EAX audio technology \n" +
                "Enjoy compelling 3D audio and 5-channel sound on multiple speaker series \n" +
                "Rich software bundled \n" +
                "HRTF-base 3D positional audio, supporting DirectSound 3D, EAX and A3D interfaces \n" +
                "Supports multi-speaker output to 4speakers \n" +
                "Supports EAX, karaoke key, and Echo sound effects \n" +
                "Complies with Microsoft PC99 specification \n" +
                "Wave table synthesizer: DLS-base Wavetable music synthesizer Software compatibility: fully Sound Blaster, Sound Blaster Pro and DirectSound compatible \n" +
                "External connector: SPK1,SPK2, line-in, MIC-in \n" +
                "Internal connector: CD audio, AUX connectors \n" +
                "3D effect: Microsoft DirectSound 3D; Aureal A3D; HRTF 3D extension positional audio; EAX ", "Semlos", type,
                "http://ecx.images-amazon.com/images/I/71RUDN58BvL._SL1500_.jpg"));
        audioVideoCards.add(new Part(99, "STRIX SOAR Sound Card", BuildStore.Amazon, "Designed to enhance your gaming experience with 600 Ohm headphone amp, 116dB SNR, and ESS SABRE9006A DAC, the STRIX Soar 7.1 sound card adds high fidelity directional audio to your game so you can hear your targets even before you see them.", "Asus", type,
                "http://ecx.images-amazon.com/images/I/91gIwDNkYEL._SL1500_.jpg"));
        audioVideoCards.add(new Part(299, "Sound Blaster X-Fi Titanium HD Internal Sound Card with THX SB1270", BuildStore.Amazon, "The Sound Blaster X-Fi Titanium HD provides the highest quality audio playback of any sound card Creative has ever introduced and includes THX TruStudio PC audio technology, bringing together two of the most respected names in sound quality to provide an unparalleled audio experience on the PC. The Sound Blaster X-Fi Titanium HD features audiophile-grade components for high-quality playback of music, games and movies, including 122db SNR Digital-to-Analog Converters (DACs), the highest signal-to-noise ratio ever produced by a Creative sound card.", "Creative", type,
                "http://ecx.images-amazon.com/images/I/7165TGJ27FL._SL1500_.jpg"));
        audioVideoCards.add(new Part(30, "PCI 7.1 Channel Sound Card with Optical SPDIF Input and Output", BuildStore.Amazon, "PCI 7.1 Channel sound card \n" +
                "Cmedia 8768 Chipset \n" +
                "HRTF-base 3D positional audio, supporting DirectSound 3D, EAX and A3D interfaces \n" +
                "Supports multi-speaker output to 8 speakers \n" +
                "Supports EAX, karaoke key, and Echo sound effects \n" +
                "Complies with Microsoft PC99 specification \n" +
                "Wave table synthesizer: DLS-base Wavetable music synthesizer \n" +
                "Software compatibility: fully Sound Blaster, Sound Blaster Pro and Direct Sound compatible \n" +
                "Fiber-Optic Input / Output for SPDIF \n" +
                "Connector : Bass channel output, Rear channel output, surround sound output, microphone input, line \n" +
                "\n" +
                "transmission Income, headphone output \n" +
                "Driver support for : Windows XP, Vista,Win7, Win 8 and Linux \n" +
                "\n" +
                "Package Content : \n" +
                "\n" +
                "1 x Sound card \n" +
                "1 X Driver CD \n" +
                "1 x Fibre Optic connector", "Sedna", type,
                "http://ecx.images-amazon.com/images/I/61vmmSgV7EL._SL1000_.jpg"));
        audioVideoCards.add(new Part(150, "SoundWave 7.1 PCI Sound Card IC-710012-S2", BuildStore.Amazon, "SIIG's Sound Wave 7.1 PCI allows you to enjoy high-definition 7.1 surround sound from your desktop computer system. This brilliant PCI sound card supports 8-channel output (Dolby Digital EX and DTS ES 6.1/7.1CH DVD audio formats) and delivers a 24-bit/96KHz digital output audio quality. It features unique karaoke functionalities such as microphone echo, key shifting, and vocal cancellation, and allows user to utilize the power and surround sound of EAX audio technologies to customize internet audio properties. The Sound Wave 7.1 PCI also automatically places speakers to preferred positions via its speaker shifter technology without having to move actual speakers. The Sound Wave 7.1 PCI sound card supports the latest in 3D audio technologies, including Sensaura EAX, A3D, DirectSound and most industrial standards of PC 3D sound for gaming. It conforms to PCI specification, revision 2.2 and PC99 specification. It is also FCC Class B (DoC) and CE regulatory approved, and RoHS compliant. The Sound Wave 7.1 PCI is fully compatible with a wide variety of Windows operating systems and is backed by SIIG's 5-year warranty.", "SIIG", type,
                "http://ecx.images-amazon.com/images/I/613b3CsWKpL._SL1063_.jpg"));
        audioVideoCards.add(new Part(85, "MIO-892 Sound Board MIO-AUDIO 892", BuildStore.Amazon, "Sound Cards, Asus, MIO-AUDIO 892, MIO-AUDIO 892", "Asus", type,
                "http://ecx.images-amazon.com/images/I/51iZNPwxKlL.jpg"));
        audioVideoCards.add(new Part(86, "Labs USB Sound Blaster Audigy2 External Sound Card Sound System (70SB030000000)", BuildStore.Amazon, "Revolutionize your PC and Notebook music, games, and movies with the ultra-premium sound of Sound Blaster Audigy 2 NX with remote. This high fidelity, external, USB 2.0 ready sound system delivers superior 24-bit ADVANCED HD audio quality, 24-bit DVD-Audio playback, and captivating 7.1 surround with Notebooks and PCs.", "Creative", type,
                "http://ecx.images-amazon.com/images/I/41AMN5SBXXL.jpg"));
        audioVideoCards.add(new Part(150, "4 Channel 5.1 Surround 3D PCI Audio Sound Card for Desktop Computer", BuildStore.Amazon, "Size: Approx.11.5 x 3.8 x 11.1cm(L x W x H)\n" +
                "CD diameter: Approx.7.7cm\n" +
                "4 Channel speaker output (Front/Rear/Center-Bass).\n" +
                "Work for PC MS Windows 98SE/Me/2000/XP/VISTA/7\n" +
                "Easy and convenient to use. Package Included: 1x Sound Card (Without retailing packing) 1x CD-ROM", "Gotd", type,
                "http://ecx.images-amazon.com/images/I/610PzEYD2YL._SL1035_.jpg"));

    }



}
