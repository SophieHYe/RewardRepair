/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 09 23:14:59 GMT 2019
 */

package org.traccar.protocol;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jboss.netty.buffer.BigEndianHeapChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.junit.runner.RunWith;
import org.traccar.protocol.TmgFrameDecoder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TmgFrameDecoder_ESTest extends TmgFrameDecoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TmgFrameDecoder tmgFrameDecoder0 = new TmgFrameDecoder();
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)126;
      BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer0 = new BigEndianHeapChannelBuffer(byteArray0);
      Object object0 = tmgFrameDecoder0.decode((ChannelHandlerContext) null, (Channel) null, bigEndianHeapChannelBuffer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TmgFrameDecoder tmgFrameDecoder0 = new TmgFrameDecoder();
      try { 
        tmgFrameDecoder0.decode((ChannelHandlerContext) null, (Channel) null, (ChannelBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.traccar.protocol.TmgFrameDecoder", e);
      }
  }
}
