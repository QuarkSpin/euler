using CSharpEuler;
using Xunit;

namespace CSharpEulerTests
{
    public class ProblemTests
    {
        [Fact]
        public void Problem001Test() => Assert.Equal(233168, new Problem001().Solve());
    }
}
