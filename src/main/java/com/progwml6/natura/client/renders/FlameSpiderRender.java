package com.progwml6.natura.client.renders;

//import com.progwml6.natura.entity.HeatscarSpider;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSpider;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class FlameSpiderRender extends RenderSpider
{

	public FlameSpiderRender(RenderManager renderManagerIn)
	{
		super(renderManagerIn);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return texture;
	}

	/**protected void scaleSpider (HeatscarSpider par1EntityCaveSpider, float par2)
	{
	    GL11.glScalef(2.0F, 2.0F, 2.0F);
	}

	@Override
	protected void preRenderCallback (EntityLivingBase par1EntityLivingBase, float par2)
	{
	    this.scaleSpider((HeatscarSpider) par1EntityLivingBase, par2);
	}*/

	static final ResourceLocation texture = new ResourceLocation("natura", "textures/mob/flamespider.png");

}