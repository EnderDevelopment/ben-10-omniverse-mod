package com.milyasmuhammad306.ben10omniversemod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class Ben10Entity extends Monster {
    protected Ben10Entity(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }
}
