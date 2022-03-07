package com.mos.truthandlight.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TruthAndLightModCreativeTab {
    public static final CreativeModeTab TruthAndLightModCreativeTab = new CreativeModeTab("truthandlight_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TruthAndLightModItem.CHROMIUM.get());
        }
    };
         public ItemStack makeIcon() {
            return new ItemStack(TruthAndLightModItem.RAW_CHROMIUM.get());
        }
    };
     public ItemStack makeIcon() {
            return new ItemStack(TruthAndLightModItem.CHROMIUM_SWORD.get());
        }
    };
     public ItemStack makeIcon() {
            return new ItemStack(TruthAndLightModItem.CHROMIUM_HELMET.get());
        }
    };

