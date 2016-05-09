package comp640.computerbuilder.dummy;

import java.util.ArrayList;
import java.util.List;

import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;

/**
 * Created by deandubois on 5/1/16.
 */
public class DummyCPU implements IDummyParts{
    private List<Part> cpu;

    public DummyCPU()
    {
        cpu = new ArrayList<>();

        cpu.add(new Part(98, "AMD FD6300WMHKBOX FX-6300 6-Core Processor Black Edition", BuildStore.Amazon, "AMD FX 6-Core Processor, Unlocked, Black Edition. AMD's next-generation architecture takes 8-core processing to a new level. Get up to 24% better frame rates in some of the most demanding games, at stunning resolutions. Get faster audio encoding so you can enjoy your music sooner. Go up to 5.0 GHz with aggressive cooling solutions from AMD.", "AMD", PartType.CPU,
                "http://ecx.images-amazon.com/images/I/41xjeiOr-SL.jpg"));
        cpu.add(new Part(115, "Intel Boxed Core I7-6700K 4.00 GHz 8M Processor Cache 4 LGA 1151 BX80662I76700K", BuildStore.Amazon, "With faster, intelligent, multi-core technology that applies processing power where it's needed most, Intel Core i7 processors deliver an incredible breakthrough in PC performance. You'll multitask applications faster and unleash incredible digital media creation. And you'll experience maximum performance for everything you do.", "Intel", PartType.CPU,
                "http://ecx.images-amazon.com/images/I/71V53vTiVhL._SL1500_.jpg"));
        cpu.add(new Part(85, "Intel Core BX80646I74790K i7-4790K Processor (8M Cache, up to 4.40 GHz)", BuildStore.Amazon, "Boxed Intel Core i7-4790K Processor (8M Cache, up to 4.10 GHz) FC-LGA12C.", "Intel", PartType.CPU,
                "http://ecx.images-amazon.com/images/I/51eUdKTIcsL.jpg"));
        cpu.add(new Part(95, "AMD FD8320FRHKBOX FX-8320 FX-Series 8-Core Black Edition Processor", BuildStore.Amazon, "AMD FX-8320 Eight-Core Processor 3.5GHz Socket AM3+, Retail", "AMD", PartType.CPU,
                "http://ecx.images-amazon.com/images/I/51rRMnzcyUL.jpg"));
        cpu.add(new Part(64, "AMD Athlon X4 860K Black Edition CPU Quad Core FM2+ 3700Mhz 95W 4MB AD860KXBJABOX", BuildStore.Amazon, "Do more of the things you want to in less time and enhance your digital life with the multi-core performance and energy efficiency of AMD Athlon X4 860K Black Edition processor-based desktop systems. When combined with superior AMD Radeon discrete graphics card, systems based on the AMD Athlon processor deliver a vivid visual experience, superior multi-tasking, and exceptional digital media performance with next-generation energy efficiency.", "AMD", PartType.CPU,
                "http://ecx.images-amazon.com/images/I/41S993K53EL.jpg"));
        cpu.add(new Part(45, "Intel Core I5-520M Cpu", BuildStore.Amazon, "Intel Core i5 i5-520M 2.40 GHz Processor - Dual-core BX80617I5520M Intel Processors", "Intel", PartType.CPU,
                "http://ecx.images-amazon.com/images/I/81QDNUtmyrL._SL1500_.jpg"));
        cpu.add(new Part(181, "Intel Core i5-4460 LGA 1150 CPU - BX80646I54460", BuildStore.Amazon, "Intel Core i5 4460 3.2GHZ 6M LGA1150 CPU, Retail ( New item)", "Intel", PartType.CPU,
                "http://ecx.images-amazon.com/images/I/81scYFwjo1L._SL1500_.jpg"));
        cpu.add(new Part(35, "AMD A4-7300 APU Dual Core Radeon CPU Processor HD8470D Graphics FM2 4000Mhz 65W 1MB AD7300OKHLBOX", BuildStore.Amazon, "This new APU form AMD continues to revolutionize the microprocessor market. It is part of the first APU family to deliver H.S.A. (Heterogeneous Systems Architecture which defines how the CPU cores interact with the GPU cores. This APU also is Mantle capable, improving it's console-like optimizations. AMD True Audio technology also immerses the user into a depth of sound never delivered before, as game developers create with this technology in mind!", "AMD", PartType.CPU,
                "http://ecx.images-amazon.com/images/I/71jz7j9IpnL._SL1500_.jpg"));
        cpu.add(new Part(244, "Intel Boxed Core I5-6600K 3.50 GHz, 6 M Processor Cache 6 for LGA 1151 (BX80662I56600K)", BuildStore.Amazon, "With intelligent performance that accelerates in response to demanding tasks, such as playing games and editing photos, the Intel Core i5 processor moves faster when you do. The Intel Core i5 processor automatically allocates processing power where it's needed most. Whether you're creating HD video, composing digital music, editing photos, or playing the coolest PC games - with the Intel Core i5 processor you can multitask with ease and be more productive than ever.", "Intel", PartType.CPU,
                "http://ecx.images-amazon.com/images/I/81WOZeCgWhL._SL1500_.jpg"));
        cpu.add(new Part(133, "Intel BX80662I36100 Core i3-6100 3M Cache, 3.70 GHz Processor", BuildStore.Amazon, "6th Gen Intel core i3 processor for Desktop offers striking visuals, extended battery life, and higher data transfer rates, while leveraging the power efficiency of a new microarchitecture to deliver faster performance than previous generation processors. Intel's 6th Gen Desktop processor bring support for DDR4 RAM technology to have up to 64GB Memory & higher transfer rate at lower power compared to DDR3. Increased security. Native support for new DirectX 12 API to provide better experience for gaming & graphics Incorporates support for HVEC,VP8 & VP9 to run Ultra HD 4K videos. Quick sync video technology accelerates most video capabilities to allow users to create & share in real time & multi task without interruption. Intel SGX help protect system & data. Also, Device protection technology with BIOS Guard 2.0 & boot guard help protect system during boot.", "Intel", PartType.CPU,
                "http://ecx.images-amazon.com/images/I/71TAF2Z73uL._SL1500_.jpg"));
        cpu.add(new Part(145, "Intel Core i7-4790K Devil's Canyon Quad-Core 4.0 GHz LGA 1150 BX80646I74790K Desktop Processor Intel HD Graphics 4600", BuildStore.Newegg, "Heatsink and fan included", "Intel", PartType.CPU,
                "http://images17.newegg.com/is/image/newegg/19-117-369-TS?$S640W$"));
        cpu.add(new Part(59, "Intel G3260 3MB Haswell Dual-Core 3.3 GHz LGA 1150 BX80646G3260 Desktop Processor", BuildStore.Newegg, "The Intel Pentium G3260 processor is based on the new 22nm Haswell Microarchitecture for improved CPU performance. State-of-the-art power management innovations help keep power consumption in check. The virtualization technology enables better productivity and manageability. Advanced Intel integrated graphics enables discrete-level graphics performance. Extract more power from your Haswell core-based processor.", "Intel", PartType.CPU,
                "http://images17.newegg.com/is/image/newegg/19-117-545-TS?$S640$"));
        cpu.add(new Part(124, "Intel Core i3-4170 3M Haswell Dual-Core 3.7 GHz LGA 1150 54W BX80646I34170 Desktop Processor Intel HD Graphics 4400", BuildStore.Newegg, "The Intel 4th generation Core i3-4170 processor is based on the new 22nm Haswell Microarchitecture for improved CPU performance. Advanced power management innovations help keep power consumption in check. New compute instructions ensures enhanced performance per cycle.  Improved Intel integrated graphics enables discrete-level graphics performance. Extract more power from your Haswell core-based processor.", "Intel", PartType.CPU,
                "http://images17.newegg.com/is/image/newegg/19-117-543-Z01?$S640$"));
        cpu.add(new Part(199, "Intel Core i5-4570 Haswell Quad-Core 3.2 GHz LGA 1150 84W BX80646I54570 Desktop Processor Intel HD Graphics", BuildStore.Newegg, "Awesome chip. Great for a budget gaming computer.", "Intel", PartType.CPU,
                "http://images17.newegg.com/is/image/newegg/19-116-896-Z01?$S640$"));
        cpu.add(new Part(199, "Intel Core i5-3550 Ivy Bridge Quad-Core 3.3GHz (3.7GHz Turbo) LGA 1155 77W BX80637I53550 Desktop Processor Intel HD Graphics 2500", BuildStore.Newegg, "With an entirely new 22nm process, the 3nd generation Intel Core i7-3770 Processor achieves dramatic performance gain at low operating voltage. The integrated graphics has been beefed up with more horsepower and a rich set of new features are provided for a stunning and seamless visual PC experience with no additional hardware required. The memory controller has been updated to officially support DDR3-1600/1333, and there's support for the new PCI Express 3.0 standard. The 3rd generation Intel Core i5 processor delivers even more performance automatically when you need it and now a better visual PC experience built-in. With Intel Turbo Boost Technology 2.0, the 3rd generation Intel Core i5 processor increases your PCís speed automatically for your demanding applications. Thatís visibly smart performance with a boost. ", "Intel", PartType.CPU,
                "http://images10.newegg.com/productimage/19-116-505-03.jpg"));
        cpu.add(new Part(309, "Intel Core i7-4790 Haswell Quad-Core 3.6 GHz LGA 1150 84W BX80646I74790 Desktop Processor Intel HD Graphics 4600", BuildStore.Newegg, "The Intel 4th generation Core i7-4790 processor is based on the new 22nm Haswell Microarchitecture for improved CPU performance. Advanced power management innovations help keep power consumption in check. New compute instructions ensure enhanced performance per cycle. Improved Intel integrated graphics enables discrete-level graphics performance. Extract more power from your Haswell core-based processor.", "Intel", PartType.CPU,
                "http://images17.newegg.com/is/image/newegg/19-116-987-Z02?$S640$"));
        cpu.add(new Part(306, "Intel Core i7-4770 Haswell Quad-Core 3.4 GHz LGA 1150 84W BX80646I74770 Desktop Processor Intel HD Graphics", BuildStore.Newegg, "Great combination of speed and reasonable temperature. Stays cool with the stock Intel heat sink and fan. Has run almost nonstop for 18 months, no hiccups or outages.", "Intel", PartType.CPU,
                "http://images17.newegg.com/is/image/newegg/19-116-900-Z01?$S640$"));
        cpu.add(new Part(302, "Intel Core i7-4770S Haswell Quad-Core 3.1 GHz LGA 1150 65W BX80646I74770S Desktop Processor Intel HD Graphics", BuildStore.Newegg, "The 4th generation Intel Haswell Core i7-4770S processor is based on the 22nm Haswell Microarchitecture. With quad-core and eight threads, it runs at 3.1GHz clock speed and comes with 8MB of L3 cache memory. New compute instructions ensure enhanced performance per cycle. Improved Intel integrated graphics enable discrete-level graphics performance.", "Intel", PartType.CPU,
                "http://images17.newegg.com/is/image/newegg/19-116-902-Z01?$S640$"));
        cpu.add(new Part(456, "Intel Core i3-6300 Skylake Dual-Core 3.8 GHz LGA 1151 65W BX80662I36300 Desktop Processor Intel HD Graphics 530", BuildStore.Newegg, "The 6th generation Intel Core processor is based on the Skylake micro architecture and built with 14nm manufacturing process. It comes packed with advanced features to take your productivity, creativity and 3D gaming to the next level. And, by enabling new exciting Windows 10 features, the 6th generation Intel Core processor empowers you to unleash your imagination and explore the possibilities.\n" +
                "\n" +
                "The Intel Core i3-6300 comes with two-core, four-thread configuration, delivering the performance and capability you need for everyday home and office tasks, as well as a host of new features to help you make the most of your PC experience.", "Intel", PartType.CPU,
                "http://images17.newegg.com/is/image/newegg/19-117-622-Z01?$S640$"));
        cpu.add(new Part(297, "Intel Core i7-4790S Haswell Quad-Core 3.2 GHz LGA 1150 65W BX80646I74790S Desktop Processor Intel HD Graphics 4600", BuildStore.Newegg, "Want a system that can not only rock the latest game but also rip through your media? Then combining a 4th gen Intel Core processor in the LGA1150 socket with the latest IntelÆ 8 Series Z chipsetwill get you the results you want. The built-invisuals of the 4th gen Intel Core processors deliver everything you need to enjoy a stun-ning and seamless graphic experience when viewing and interacting with pictures and media on your PC without the need for a discrete graphics card, thanks to IntelÆ HD Graphics 4600-the new baseline for all 4th genIntelÆ Coreô i5 and IntelÆ Coreô i7 processors. IntelÆ Quick Sync Video allows the conversion of media from one device to another and prepares your media to share it online at incredible speeds. And when the need to frag a zombie arises, the Intel 8 Series Z chipset, paired with Lucidlogix Virtu software, allows you to switch over to a discrete graphics card for high-end 3-D gaming.", "Intel", PartType.CPU,
                "http://images17.newegg.com/is/image/newegg/19-116-988-Z02?$S640$"));
    }

    public List<Part> getParts() {return cpu;}
}
