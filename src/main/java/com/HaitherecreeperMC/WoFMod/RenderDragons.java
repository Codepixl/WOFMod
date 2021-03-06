package com.HaitherecreeperMC.WoFMod;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderDragons extends RenderCow
{
  private static final ResourceLocation drag = new ResourceLocation("wofmod:textures/mobs/BabyDragon.png");
  private static final String __OBFID = "CL_00001023";
  
  public RenderDragons()
  {
	  super(new RenderManager(null,null), new ModelBabyDragon(), 0.5F);
  }
  
  protected void preRenderCallback(EntityDragons par1EntityDragon, float par2) {
  }
  
  public void func_82422_c()
  {
    GL11.glTranslatef(0.09375F, 0.1875F, 0.0F);
  }
  
  protected ResourceLocation getEntityTexture(EntityDragons par1EntityDragon)
  {
    return drag;
  }
  
  protected ResourceLocation getEntityTexture(EntityLiving par1EntityLiving)
  {
    return getEntityTexture((EntityDragons)par1EntityLiving);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
  {
    preRenderCallback((EntityDragons)par1EntityLivingBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity par1Entity)
  {
    return getEntityTexture((EntityDragons)par1Entity);
  }
}
