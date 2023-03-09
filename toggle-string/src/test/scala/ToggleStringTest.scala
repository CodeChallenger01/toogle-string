import org.scalatest.flatspec.AnyFlatSpec

class ToggleStringTest extends AnyFlatSpec{
  val obj=new ToggleString
  it should "match with input Manish" in{
    assert("mANISH"==obj.toggleString("Manish"))
  }
  it should "match with other input sCaLA" in {
    assert("ScAla"== obj.toggleString("sCaLA"))
  }
}