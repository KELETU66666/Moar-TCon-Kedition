package com.existingeevee.moretcon.inits;

import com.existingeevee.moretcon.fluid.BlockFluid;
import com.existingeevee.moretcon.other.BlockMaterials;
import com.existingeevee.moretcon.other.utils.CompatManager;
import com.existingeevee.moretcon.other.utils.RegisterHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModFluidBlocks {
	/* ------------------------------------- */
	public static Block blockLiquidFusionite;
	public static Block blockLiquidIrradium;
	public static Block blockLiquidGallium;
	public static Block blockLiquidPenguinite;
	public static Block blockLiquidSolarSteel;
	public static Block blockLiquidHydrogen;
	public static Block blockLiquidSyrmorite;
	public static Block blockLiquidOctine;
	public static Block blockBurningSulfurFlow;
	public static Block blockLiquidEmber;
	public static Block blockLiquidIronwood;
	public static Block blockLiquidRuneSteel;
	public static Block blockLiquidArkenium;
	public static Block blockLiquidValkyrieMetal;
	public static Block blockLiquidGravitonium;
	public static Block blockLiquidTrichromadentium;
	public static Block blockLiquidAtronium;
	public static Block blockLiquidEbonite;
	public static Block blockLiquidSwampSteel;
	public static Block blockLiquidRotiron;
	public static Block blockRottenSludge;
	public static Block blockMummySludge;
	public static Block blockBetweenSludge;
	public static Block blockLiquidGoldenAmber;
	/* ------------------------------------- */
	private static void registerBlocks(Block... block) {
		for (Block i : block) {
			ModFluidBlocks.addBlock(i);
		}
	}

	public static void init() {
		if (CompatManager.loadMain) {
			blockLiquidFusionite = new BlockFluid("liquidfusionite", ModFluids.liquidFusionite, Material.LAVA);
			blockLiquidIrradium = new BlockFluid("liquidirradium", ModFluids.liquidIrradium, Material.LAVA);
			blockLiquidSolarSteel = new BlockFluid("liquidsolarsteel", ModFluids.liquidSolsteel, Material.LAVA);
			blockLiquidHydrogen = new BlockFluid("liquidhydrogen", ModFluids.liquidHydrogen, BlockMaterials.GAS);
			blockLiquidGallium = new BlockFluid("liquidgallium", ModFluids.liquidGallium, Material.LAVA);
			blockLiquidRuneSteel = new BlockFluid("liquidrunesteel", ModFluids.liquidRuneSteel, Material.LAVA);
			blockLiquidGravitonium = new BlockFluid("liquidgravitonium", ModFluids.liquidGravitonium, Material.LAVA);
			blockLiquidTrichromadentium = new BlockFluid("liquidtrichromadentium", ModFluids.liquidTrichromadentium, Material.LAVA);
			blockLiquidAtronium = new BlockFluid("liquidatronium", ModFluids.liquidAtronium, Material.LAVA);
			blockLiquidEbonite = new BlockFluid("liquidebonite", ModFluids.liquidEbonite, Material.LAVA);			
			
			
		    ModFluidBlocks.registerBlocks(
/* ------------------------------------- */
				blockLiquidFusionite,
				blockLiquidIrradium,
				blockLiquidSolarSteel,
				blockLiquidHydrogen,
				blockLiquidGallium,
				blockLiquidRuneSteel,
				blockLiquidGravitonium,
				blockLiquidTrichromadentium,
				blockLiquidAtronium,
				blockLiquidEbonite
/* ------------------------------------- */
				);
		}
		if(CompatManager.twilightforest) {
			blockLiquidPenguinite = new BlockFluid("LiquidPenguinite".toLowerCase(), ModFluids.liquidPenguinite, Material.LAVA);
			blockLiquidIronwood = new BlockFluid("LiquidIronWood".toLowerCase(), ModFluids.liquidIronwood, Material.LAVA);
			ModFluidBlocks.registerBlocks(
/* ------------------------------------- */
					blockLiquidPenguinite,
					blockLiquidIronwood
/* ------------------------------------- */
					);
		}
		if(CompatManager.aether_legacy) {
			blockLiquidArkenium = new BlockFluid("liquidarkenium", ModFluids.liquidArkenium, Material.LAVA);
			blockLiquidValkyrieMetal = new BlockFluid("liquidvalkyriemetal", ModFluids.liquidValkyrieMetal, Material.LAVA);
			blockLiquidGoldenAmber = new BlockFluid("liquidgoldenamber", ModFluids.liquidGoldenAmber, Material.WATER);
			ModFluidBlocks.registerBlocks(
/* ------------------------------------- */
					blockLiquidArkenium,
					blockLiquidValkyrieMetal,
					blockLiquidGoldenAmber
			/* ------------------------------------- */
					);
		}
		if(CompatManager.thebetweenlands) {
			blockBurningSulfurFlow = new BlockFluid("burningSulfurFlow".toLowerCase(), ModFluids.liquidBurningSulfurFlow, Material.LAVA);
			blockLiquidOctine = new BlockFluid("liquidoctine", ModFluids.liquidOctine, Material.LAVA);
			blockLiquidSyrmorite = new BlockFluid("liquidsyrmorite", ModFluids.liquidSyrmorite, Material.LAVA);
			blockLiquidEmber = new BlockFluid("liquidember", ModFluids.liquidEmber, Material.LAVA);
			blockLiquidSwampSteel = new BlockFluid("liquidswampsteel", ModFluids.liquidSwampSteel, Material.LAVA);
			blockLiquidRotiron = new BlockFluid("liquidrotiron", ModFluids.liquidRotiron, Material.LAVA);
			blockRottenSludge = new BlockFluid("rottensludge", ModFluids.liquidRottenSludge, Material.WATER);
			blockMummySludge = new BlockFluid("mummysludge", ModFluids.liquidMummySludge, Material.WATER);
			blockBetweenSludge = new BlockFluid("betweensludge", ModFluids.liquidBetweenSludge, Material.WATER);

			ModFluidBlocks.registerBlocks(
/* ------------------------------------- */
					blockBurningSulfurFlow,
					blockLiquidSyrmorite,
					blockLiquidOctine,
					blockLiquidEmber,
					blockLiquidSwampSteel,
					blockLiquidRotiron,
					blockRottenSludge,
					blockMummySludge,
					blockBetweenSludge
/* ------------------------------------- */
					);
		}
	}
	private static void addBlock(Block block) {

		RegisterHelper.registerBlock(block);
		ModBlocks.totalBlocks++;
	}
}
